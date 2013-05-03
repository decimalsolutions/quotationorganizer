$(function() {

	var URL = '/trends/users';
	var options = {
		url: URL,
		
		editurl: URL,
		datatype:"json",
		loadonce: true,
		jsonReader: { repeatitems: false } ,
		colModel:[
			{
				name:'id', 
				label: 'ID',
				width: 40,
				editable: true,
				editoptions: {disabled: true, size:5}
			},
			{
				name:'firstName',
				
				label: 'First Name',
				width: 300,
				editable: true,
				editrules: {required: true}
			},
			{
				name:'lastName',
			
				label: 'Last Name',
				width: 300,
				editable: true,
				editrules: {required: true}
			},
			{
				name:'email',
				
				label: 'E-Mail',
				width: 300,
				editable: true,
				editrules: {required: true}
			}
		],
		caption: "Users",
		pager : '#pager',
		height: 'auto'
		
	};

	jQuery("#grid").jqGrid(options).navGrid('#pager');

});
