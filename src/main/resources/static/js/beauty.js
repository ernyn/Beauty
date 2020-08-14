'use strict';

    function formCheck(){
      var flag = 0;

        if( document . Form1 . InputText1 . value == "" ){
            flag = 1;
            document . getElementById( 'input-text-1' ) . style . display = "block";
        }else{
            document . getElementById( 'input-text-1' ) . style . display = "none";
        }


        if( document . Form1 . InputText2 . value == "" ){
            flag = 1;
            document . getElementById( 'input-text-2' ) . style . display = "block";
        }else{
            document . getElementById( 'input-text-2' ) . style . display = "none";
        }


        if( document . Form1 . InputText3 . value == "" ){
            flag = 1;
            document . getElementById( 'input-text-3' ) . style . display = "block";
        }else{
            document . getElementById( 'input-text-3' ) . style . display = "none";
        }


        if( document . Form1 . InputText4 . value == "" ){
            flag = 1;
            document . getElementById( 'input-text-4' ) . style . display = "block";
        }else{
            document . getElementById( 'input-text-4' ) . style . display = "none";
        }


        if( flag ){
            window . alert( '必須項目は全て入力して下さい。' );
            return false;
        }else{
            return true;
        }
    }

    function clickHome(){
        window.location.href = 'index.html';
    }

    