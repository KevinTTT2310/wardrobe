//function getWardrobe(){
//    $.get("/api/register/", function(data){
//
//    if(data.length <= 0){
//    return;
//    }
//
//    var html = "";
//
//    for(var i=0; i < data.length; i++){
//        html += "<p>" data[i].name "</p>"
//    }
//
//    $("#wardrobe").html(html);
//    });
//}

function saveWardrobe(e){
    e.preventDefault();

    var name = $("#name").val();

    $.post("/api/register/add",
    {
    name: name,
    }
)
}

function createWardrobe(){
$.get("/api/wardrobe/add", function(data){
alert(data);
});
}

function open(){
$.get("/api/wardrobe/open", function(data){
alert(data);
});
$("#open").hide()

}

function close(){
$.get("/api/wardrobe/close", function(data){
alert(data);
});
}


function getIn(){
$.get("/api/wardrobe/getIn", function(data){
alert(data);
});
}



function getOut(){
$.get("/api/wardrobe/getOut", function(data){
alert(data);
});
}

function kick(){}

function getInNarnia(){}



//function spawnWitch(){}
//
//function spawnLion(){
//if witch is defeated, lion appears
//button appears to talk to lion
//}

$("#enter").click(createWardrobe);
$("#open").click(open);
$("#close").click(close);
$("#getIn").click(getIn);
$("#getOut").click(getOut);
$("#kick").click(kick);