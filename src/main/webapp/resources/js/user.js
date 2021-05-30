function getContextPath() {
    var hostIndex = location.href.indexOf( location.host ) + location.host.length;
    return location.href.substring( hostIndex, location.href.indexOf('/', hostIndex + 1) );
}

function saveUser(){
	let form = {
		userName : $("#userName").val(),
		password : $("#password").val()
	}
	
	
	$.ajax({
		url : 'saveUser', type: 'POST' , dataType : 'json',
		data : JSON.stringify(form),
		contentType : "application/json; charset=utf-8",
		success:function(result){
			if(result.saveResult == true){
				alert('회원가입완료')
				location.href = getContextPath()
			}else if(result.saveResult == false){
				alert('이미 있는 아이디입니다')
			}
		},
		error:function(){
			alert('회원가입 에러발생')
		}
	})	
}

function loginUser(){
	let form = {
		userName : $("#userName").val(),
		password : $("#password").val()
	}
	
	$.ajax({
		url : 'loginUser', type: 'POST' ,
		data : JSON.stringify(form),
		contentType : "application/json; charset=utf-8",
		success:function(result){
			if(result.loginResult == true){
				alert('로그인 완료')
				location.href = getContextPath()
			}
			else{
				alert('아이디나 비밀번호가 틀립니다')
			}
		},
		error : function(){
			alert('로그인 에러발생')
		}
	})	
	
}