function showLogin()
{
    document.getElementById("login").style.display="block";
    document.getElementById("register").style.display="none";
}
function showRegister()
{   document.getElementById("login").style.display="none";
    document.getElementById("register").style.display="block";
}

const Regform=document.getElementById("register");
Regform.addEventListener("submit", async function (e) {
        e.preventDefault();

        const data = {
            businessName: document.getElementById("businessName").value.trim(),
            gst: document.getElementById("gst").value.trim(),
            address: document.getElementById("address").value.trim(),
            mob: document.getElementById("mob").value.trim(),
            email: document.getElementById("email").value.trim(),
            username: document.getElementById("username").value.trim(),
            password: document.getElementById("password").value.trim()
        };

        if (
            data.businessName === "" ||
            data.gst === "" ||
            data.address === "" ||
            data.mob === "" ||
            data.email === "" ||
            data.username === "" ||
            data.password === ""
        ) {
            alert("All fields must be filled");
            return;
        }

       

        try {
            const response = await fetch("http://localhost:8080/user/register", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(data)
            });

            const result=await response.text();
            
            console.log(result);

            if (response.ok) {
                alert("Registered Successfully");
                this.reset();
                showLogin();
            } else {
                alert(result|| "Registration failed");
            }

        } catch (error) {
            console.log(error);
            alert("Server connection failed");
            alert(error.message);
        }
    });


const Logform=document.getElementById("login");
Logform.addEventListener("submit",async function(e)
{e.preventDefault();
 const data=
 {username:document.getElementById("loginUser").value.trim(),
  password:document.getElementById("loginPass").value.trim()
 }

  if (data.username === "" || data.password=== "") 
    {
            alert("All fields must be filled");
            return;
    }

    try {
            const response = await fetch("http://localhost:8080/user/login", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(data)
            })
            .then(response => response.text())
            .then(token => {
                console.log(token);
                if(token === "Invalid Credentials")
                    {
                    alert("Invalid Login");
                    }
                else{
                     localStorage.setItem("token", token);
                     window.location.href = "dashboard.html";
                    }

    });
           

        } catch (error) {
            console.log(error);
            alert("Server connection failed");
            alert(error.message);
        }






});