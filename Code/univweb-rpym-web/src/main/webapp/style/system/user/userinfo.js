$(function(){
	var initDa = initData();
	for(var f in initDa){
		$("#dataForm [name='"+f+"']").val(initDa[f]);
	}	
});


function initDataForm(){
	var initDa = initData();
	for(var f in initDa){
		$("#dataForm [name='"+f+"']").val(initDa[f]);
	}	
}


function initSelector() {
	var config = {
            '.chosen-select': {},
            '.chosen-select-deselect': {
                allow_single_deselect: true
            },
            '.chosen-select-no-single': {
                disable_search_threshold: 10
            },
            '.chosen-select-no-results': {
                no_results_text: '没有对应选项'
            }/*,
            '.chosen-select-width': {
                width: "95%"
            }*/
        }
        for (var selector in config) {
            $("[name='ids'],[name='departmentId']").chosen(config[selector]);
        }
}
