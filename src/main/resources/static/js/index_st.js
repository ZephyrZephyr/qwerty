$(document).ready(function () {
    $('[data-toggle="offcanvas"]').click(function () {
        $('.row-offcanvas').toggleClass('active')
    });
    loadProperties();
    loadtable();
});

function loadtable() {
    var lessonlist = document.getElementById("st_index_table");
    lesson = lessonlist.insertRow();
    lessonid = lesson.insertCell();
    lessonname = lesson.insertCell();
    lessonteacher = lesson.insertCell();
    lessonnumber = lesson.insertCell();
    lessonid.innerHTML = "0001";
    lessonname.innerHTML = "yuwen";
    lessonteacher.innerHTML = "liu";
    lessonnumber.innerHTML = "1/200";
}
function loadProperties(){
    jQuery.i18n.properties({//加载资浏览器语言对应的资源文件
        name:'strings', //资源文件名称
        path:'/i18n/', //资源文件路径
        mode:'map', //用Map的方式使用资源文件中的值
        language:'En',
        callback: function() {//加载成功后设置显示内容
            $('#st_index_title').html($.i18n.prop('title'))
            $('#st_index_navbar_projectname').html($.i18n.prop('st_index_navbar_projectname'));
            $('#st_index_navbar_help').html($.i18n.prop('st_index_navbar_help'));
            $('#st_index_navbar_me').html($.i18n.prop('st_index_navbar_me'));
            $('#st_index_navbar_logout').html($.i18n.prop('st_index_navbar_logout'));
            $('#st_index_menu_classlist').html($.i18n.prop('st_index_menu_classlist'));
            $('#st_index_menu_myclass').html($.i18n.prop('st_index_menu_myclass'));
            $('#st_index_menu_blog').html($.i18n.prop('st_index_menu_blog'));
            $('#st_index_menu_news').html($.i18n.prop('st_index_menu_news'));
        }
    });
}

