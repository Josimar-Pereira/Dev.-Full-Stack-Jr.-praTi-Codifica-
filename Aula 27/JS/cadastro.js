const form = document.querySelector("#form-cadastro");

// Registrar o usuário ao enviar o formulário

form.addEventListener("submit", (evento) => {
    evento.preventDefault(); // Impede o recarregamento da pagina
    const usuario = {
        email: document.querySelector("#email").value,
        senha: document.querySelector("#senha").value
    }
})