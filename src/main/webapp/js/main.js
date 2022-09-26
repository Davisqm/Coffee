var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function () {

    $(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });

    getUsuario().then(function () {

        $("#mi-perfil-btn").attr("href", "profile.html?username=" + username);

        $("#user-saldo").html(user.saldo.toFixed(2) + "$");

        getCafe(false, "ASC");

        $("#ordenar-factor").click(ordenarFactor);
    });
});


async function getUsuario() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPedir",
        data: $.param({
            username: username
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                user = parsedResult;
            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });
    function getCafe(ordenar, orden) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletCafeListar",
            data: $.param({
                ordenar: ordenar,
                orden: orden
            }),
            success: function (result) {

                let parseResult = JSON.parse(result);

                if (parseResult != false) {
                    mostrarCafe(parseResult);
                } else {
                    console.log("Error recuperando los datos de cafe");
                }
            }

        });


    }}