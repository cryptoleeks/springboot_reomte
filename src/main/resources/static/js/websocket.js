var websocket=null;
if ('WebSocket' in  window){
    websocket =new WebSocket('ws://localhost:8080/ws')
}
else {
    alert('不支持ws');
}

function apppendMessage(message) {
    var context = $("#context").html()+"<br/>"+message;
    $("#context").html(context);
}
function closeWebSocket(){
    websocket.close();
}
function sendMessage()
{
    var message=$("#message").val();
    websocket.send(message);
}
websocket.onerror=function () {
    apppendMessage('error');
}
websocket.onopen=function (e) {
    apppendMessage("open");
}
websocket.onmessage=function (e) {
    apppendMessage(e.data);
}
websocket.onclose=function () {
    apppendMessage("close");
}