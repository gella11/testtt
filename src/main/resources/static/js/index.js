alert('asd')

function setboard(){

    let data = {
        btitle : document.querySelector('.btitle').value
        bcontent : document.querySelector('.bcontent').value
    }
    $.ajax({
        url: "/setboard",
        type: "POST",
        data: JSON.stringify(data),
        contentType: "application/json",
        success: function(re){
                alert('게시물 번호 :: '+re)
        }
    })
}

list()
function list(){
    $.ajax({
        url: "/list",
        type: "GET",
        success: function(list){
            console.log(list)
            let html = '<tr> <th>번호</th> <th>제목</th> <th>내용</th> </tr>';
            list.forEach( (b) =>{
                            html += '<tr> <th>'+b.bno+'</th> <th>'+b.btitle+'</th> <th>'+b.bcontent+'</th> </tr>'
            })
            document.querySelector('.list').innerHTML = html

        }
    })
}