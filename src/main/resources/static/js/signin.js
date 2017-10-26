$(function(){
    loadProperties();
});

function loadProperties(){
    jQuery.i18n.properties({//加载资浏览器语言对应的资源文件
        name:'strings', //资源文件名称
        path:'../i18n/', //资源文件路径
        mode:'map', //用Map的方式使用资源文件中的值
        language:'En',
        callback: function() {//加载成功后设置显示内容
            $('#signin_title').html($.i18n.prop('signin_title'));
            $('#signin_label_signin').html($.i18n.prop('signin_label_signin'));
            $('#signin_input_email').prop('placeholder',$.i18n.prop('signin_label_email'));
            $('#signin_input_password').prop('placeholder',$.i18n.prop('signin_label_password'));
            //$('#signin_label_rememberme').html($.i18n.prop('signin_label_remember'));
            $('#signin_button_signin').html($.i18n.prop('signin_button_signin'));
        }
    });
}