function showSection(sectionId)
{ let sections=document.querySelectorAll('.section');
  sections.forEach(sec => sec.style.display="none");

   document.getElementById(sectionId).style.display = 'block';
}

function logout(){
localStorage.removeItem("token");
window.location.href = "/index.html";
}

const openForm=document.getElementById("openProductForm");
const productForm=document.getElementById("productForm");

openForm.addEventListener("click",function(){productForm.classList.toggle("hidden");});

const openCustomerForm=document.getElementById("openCustomerForm");
const customerForm=document.getElementById("customerForm");
openCustomerForm.addEventListener("click",function(){customerForm.classList.toggle("hidden");})


const addProduct = document.getElementById("productForm");

addProduct.addEventListener("submit", async function (e) {
    e.preventDefault();

    const data = {
        productName: document.getElementById("productName").value.trim(),
        productCategory: document.getElementById("category").value.trim(),
        productPrice: document.getElementById("productPrice").value.trim(),
        productQuantity: document.getElementById("productQty").value.trim(),
       
    };

    if (
        data.productName === "" ||
        data.productCategory === "" ||
        data.productPrice === "" ||
        data.productQuantity === ""
    ) {
        alert("All fields must be filled");
        return;
    }

    try {
        const response = await fetch("http://localhost:8080/products/add", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
                "Authorization": `Bearer ${localStorage.getItem("token")}`
            },
            body: JSON.stringify(data)
        });

        const result = await response.text();

        console.log(result);

    } catch (error) {
        console.log(error);
    }
});