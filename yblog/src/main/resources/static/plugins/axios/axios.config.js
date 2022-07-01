//数据处理
/*axios.defaults.transformRequest = function(data) {
	data = JSON.stringify(data);
	return data;
};*/
axios.defaults.headers.post['X-Requested-With'] = "XMLHttpRequest";
axios.defaults.withCredentials= true
axios.interceptors.response.use(
	function(response){
		try{
			return response.data;
		} catch(error){
			console.log(error);
			switch (error.response.status) {
				case 412:
				case 414:
				case 401:
				case 500:
					window.location.href = "/error/error500"
					break;
				case 403:
					window.location.href = "/error/error403"
					break;
				case 404:
					window.location.href = "/error/error404"
					break;
			}
		}
	});