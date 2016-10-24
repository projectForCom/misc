$(function () {
    $("#get_btn").click(function () {
        $("#output").text("");
        $.ajax({
                   type: "GET",
                   url: "/ajax/get/",
                   dataType: "json",
                   success: function (data) {
                       for (var i = 0; i < data.length; i++) {
                           $("#output").append(data[i]);
                       }
                   },
                   error: function (XMLHttpRequest, textStatus, errorThrown) {
                       $("#output").append(
                           "ERROR! XMLHttpRequest:" + XMLHttpRequest +
                           ", textStatus:" + textStatus,
                           ", errorThrown:" + errorThrown);
                   }
               });
    });
});


