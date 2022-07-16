package org.example;

import java.util.HashMap;

public class Expression {
    public String input;
    public String result;

    public HashMap<String,MapValItem> values;
    public HashMap<Integer,String> arabian_answers;
    public HashMap<Integer,String> rome_answers;

    public void InitHash(){
        values = new HashMap<String,MapValItem>();
        arabian_answers = new HashMap<Integer,String>();
        rome_answers = new HashMap<Integer,String>();

        //init vals
        values.put("1",new MapValItem(1,true));
        values.put("2",new MapValItem(2,true));
        values.put("3",new MapValItem(3,true));
        values.put("4",new MapValItem(4,true));
        values.put("5",new MapValItem(5,true));
        values.put("6",new MapValItem(6,true));
        values.put("7",new MapValItem(7,true));
        values.put("8",new MapValItem(8,true));
        values.put("9",new MapValItem(9,true));
        values.put("10",new MapValItem(10,true));
        values.put("I",new MapValItem(1,false));
        values.put("II",new MapValItem(2,false));
        values.put("III",new MapValItem(3,false));
        values.put("IV",new MapValItem(4,false));
        values.put("V",new MapValItem(5,false));
        values.put("VI",new MapValItem(6,false));
        values.put("VII",new MapValItem(7,false));
        values.put("VIII",new MapValItem(8,false));
        values.put("IX",new MapValItem(9,false));
        values.put("X",new MapValItem(10,false));

        //Init answers
        arabian_answers.put(-10,"-10");
        arabian_answers.put(-9,"-9");
        arabian_answers.put(-8,"-8");
        arabian_answers.put(-7,"-7");
        arabian_answers.put(-6,"-6");
        arabian_answers.put(-5,"-5");
        arabian_answers.put(-4,"-4");
        arabian_answers.put(-3,"-3");
        arabian_answers.put(-2,"-2");
        arabian_answers.put(-1,"-1");
        arabian_answers.put(0,"0");
        arabian_answers.put(1,"1");
        arabian_answers.put(2,"2");
        arabian_answers.put(3,"3");
        arabian_answers.put(4,"4");
        arabian_answers.put(5,"5");
        arabian_answers.put(6,"6");
        arabian_answers.put(7,"7");
        arabian_answers.put(8,"8");
        arabian_answers.put(9,"9");
        arabian_answers.put(10,"10");
        arabian_answers.put(11,"11");
        arabian_answers.put(12,"12");
        arabian_answers.put(13,"13");
        arabian_answers.put(14,"14");
        arabian_answers.put(15,"15");
        arabian_answers.put(16,"16");
        arabian_answers.put(17,"17");
        arabian_answers.put(18,"18");
        arabian_answers.put(19,"19");
        arabian_answers.put(20,"20");
        arabian_answers.put(21,"21");
        arabian_answers.put(22,"22");
        arabian_answers.put(23,"23");
        arabian_answers.put(24,"24");
        arabian_answers.put(25,"25");
        arabian_answers.put(26,"26");
        arabian_answers.put(27,"27");
        arabian_answers.put(28,"28");
        arabian_answers.put(29,"29");
        arabian_answers.put(30,"30");
        arabian_answers.put(31,"31");
        arabian_answers.put(32,"32");
        arabian_answers.put(33,"33");
        arabian_answers.put(34,"34");
        arabian_answers.put(35,"35");
        arabian_answers.put(36,"36");
        arabian_answers.put(37,"37");
        arabian_answers.put(38,"38");
        arabian_answers.put(39,"39");
        arabian_answers.put(40,"40");
        arabian_answers.put(41,"41");
        arabian_answers.put(42,"42");
        arabian_answers.put(43,"43");
        arabian_answers.put(44,"44");
        arabian_answers.put(45,"45");
        arabian_answers.put(46,"46");
        arabian_answers.put(47,"47");
        arabian_answers.put(48,"48");
        arabian_answers.put(49,"49");
        arabian_answers.put(50,"50");
        arabian_answers.put(51,"51");
        arabian_answers.put(52,"52");
        arabian_answers.put(53,"53");
        arabian_answers.put(54,"54");
        arabian_answers.put(55,"55");
        arabian_answers.put(56,"56");
        arabian_answers.put(57,"57");
        arabian_answers.put(58,"58");
        arabian_answers.put(59,"59");
        arabian_answers.put(60,"60");
        arabian_answers.put(61,"61");
        arabian_answers.put(62,"62");
        arabian_answers.put(63,"63");
        arabian_answers.put(64,"64");
        arabian_answers.put(65,"65");
        arabian_answers.put(66,"66");
        arabian_answers.put(67,"67");
        arabian_answers.put(68,"68");
        arabian_answers.put(69,"69");
        arabian_answers.put(70,"70");
        arabian_answers.put(71,"71");
        arabian_answers.put(72,"72");
        arabian_answers.put(73,"73");
        arabian_answers.put(74,"74");
        arabian_answers.put(75,"75");
        arabian_answers.put(76,"76");
        arabian_answers.put(77,"77");
        arabian_answers.put(78,"78");
        arabian_answers.put(79,"79");
        arabian_answers.put(80,"80");
        arabian_answers.put(81,"81");
        arabian_answers.put(82,"82");
        arabian_answers.put(83,"83");
        arabian_answers.put(84,"84");
        arabian_answers.put(85,"85");
        arabian_answers.put(86,"86");
        arabian_answers.put(87,"87");
        arabian_answers.put(88,"88");
        arabian_answers.put(89,"89");
        arabian_answers.put(90,"90");
        arabian_answers.put(91,"91");
        arabian_answers.put(92,"92");
        arabian_answers.put(93,"93");
        arabian_answers.put(94,"94");
        arabian_answers.put(95,"95");
        arabian_answers.put(96,"96");
        arabian_answers.put(97,"97");
        arabian_answers.put(98,"98");
        arabian_answers.put(99,"99");
        arabian_answers.put(100,"100");


        rome_answers.put(-10,"-X");
        rome_answers.put(-9,"-IX");
        rome_answers.put(-8,"-XIII");
        rome_answers.put(-7,"-XII");
        rome_answers.put(-6,"-XI");
        rome_answers.put(-5,"-V");
        rome_answers.put(-4,"-IV");
        rome_answers.put(-3,"-III");
        rome_answers.put(-2,"-II");
        rome_answers.put(-1,"-I");
        rome_answers.put(0,"Rome_Zero");
        rome_answers.put(1,"I");
        rome_answers.put(2,"II");
        rome_answers.put(3,"III");
        rome_answers.put(4,"IV");
        rome_answers.put(5,"V");
        rome_answers.put(6,"VI");
        rome_answers.put(7,"VII");
        rome_answers.put(8,"VIII");
        rome_answers.put(9,"IX");
        rome_answers.put(10,"X");
        rome_answers.put(11,"XI");
        rome_answers.put(12,"XII");
        rome_answers.put(13,"XIII");
        rome_answers.put(14,"XIV");
        rome_answers.put(15,"XV");
        rome_answers.put(16,"XVI");
        rome_answers.put(17,"XVII");
        rome_answers.put(18,"XVIII");
        rome_answers.put(19,"XIX");
        rome_answers.put(20,"XX");
        rome_answers.put(21,"XXI");
        rome_answers.put(22,"XXII");
        rome_answers.put(23,"XXIII");
        rome_answers.put(24,"XXIV");
        rome_answers.put(25,"XXV");
        rome_answers.put(26,"XXVI");
        rome_answers.put(27,"XXII");
        rome_answers.put(28,"XXIII");
        rome_answers.put(29,"XXIX");
        rome_answers.put(30,"XXX");
        rome_answers.put(31,"XXXI");
        rome_answers.put(32,"XXXII");
        rome_answers.put(33,"XXXIII");
        rome_answers.put(34,"XXXIV");
        rome_answers.put(35,"XXXV");
        rome_answers.put(36,"XXXVI");
        rome_answers.put(37,"XXXVII");
        rome_answers.put(38,"XXXVIII");
        rome_answers.put(39,"XXXIX");
        rome_answers.put(40,"XL");
        rome_answers.put(41,"XLI");
        rome_answers.put(42,"XLII");
        rome_answers.put(43,"XLIII");
        rome_answers.put(44,"XLIV");
        rome_answers.put(45,"XLV");
        rome_answers.put(46,"XLVI");
        rome_answers.put(47,"XLVII");
        rome_answers.put(48,"XLVIII");
        rome_answers.put(49,"XLIX");
        rome_answers.put(50,"L");
        rome_answers.put(51,"LI");
        rome_answers.put(52,"LII");
        rome_answers.put(53,"LIII");
        rome_answers.put(54,"LIV");
        rome_answers.put(55,"LV");
        rome_answers.put(56,"LVI");
        rome_answers.put(57,"LVII");
        rome_answers.put(58,"LVIII");
        rome_answers.put(59,"LIX");
        rome_answers.put(60,"LX");
        rome_answers.put(61,"LXI");
        rome_answers.put(62,"LXII");
        rome_answers.put(63,"LXIII");
        rome_answers.put(64,"LXIV");
        rome_answers.put(65,"LXV");
        rome_answers.put(66,"LXVI");
        rome_answers.put(67,"LXVII");
        rome_answers.put(68,"LXVIII");
        rome_answers.put(69,"LXIX");
        rome_answers.put(70,"LXX");
        rome_answers.put(71,"LXXI");
        rome_answers.put(72,"LXXII");
        rome_answers.put(73,"LXXIII");
        rome_answers.put(74,"LXXIV");
        rome_answers.put(75,"LXXV");
        rome_answers.put(76,"LXXVI");
        rome_answers.put(77,"LXXVII");
        rome_answers.put(78,"LXXVIII");
        rome_answers.put(79,"LXXIX");
        rome_answers.put(80,"LXXX");
        rome_answers.put(81,"LXXXI");
        rome_answers.put(82,"LXXXII");
        rome_answers.put(83,"LXXXIII");
        rome_answers.put(84,"LXXXIV");
        rome_answers.put(85,"LXXXV");
        rome_answers.put(86,"LXXXVI");
        rome_answers.put(87,"LXXXVII");
        rome_answers.put(88,"LXXXVIII");
        rome_answers.put(89,"LXXXIX");
        rome_answers.put(90,"XC");
        rome_answers.put(91,"XCI");
        rome_answers.put(92,"XCII");
        rome_answers.put(93,"XCIII");
        rome_answers.put(94,"XCIV");
        rome_answers.put(95,"XCV");
        rome_answers.put(96,"XCVI");
        rome_answers.put(97,"XCVII");
        rome_answers.put(98,"XCVIII");
        rome_answers.put(99,"XCIX");
        rome_answers.put(100,"C");
    }

    public MapValItem GetValue(String string_value){
        MapValItem value=null;
        String t_val=string_value.trim();
        if(values.containsKey(t_val)){
            value=values.get(t_val);
        }
        if(value==null){
            throw new NullPointerException();
        }
        return value;
    }

    public String GetAnswer(Integer int_answer, boolean is_arabian){
        String answer=null;
        if(is_arabian){
            if(arabian_answers.containsKey(int_answer)){
                answer=arabian_answers.get(int_answer);
            }
        }
        else{
            if(rome_answers.containsKey(int_answer)){
                answer=rome_answers.get(int_answer);
            }
        }
        if(answer==null) {
            throw new NullPointerException();
        }
        return answer;
    }
    public  Expression(String input_){
        input=input_;
        result=null;
        InitHash();
    }
    public boolean Eval(){
        String []vals = null;
        String operation="none";

        vals=input.split("\\-");
        if(vals.length==2){
            operation="-";
        }
        else {
            vals=input.split("\\+");
            if(vals.length==2) {
                operation = "+";
            }
            else {
                vals = input.split("\\*");
                if (vals.length == 2) {
                    operation = "*";
                } else {
                    vals = input.split("/");
                    if (vals.length == 2) {
                        operation = "/";
                    }
                }
            }
        }

        boolean error=true;
        boolean arabian=true;
        Integer answer=-100;
        MapValItem left,right;
        if(operation!="none" || vals!=null){
            if(vals.length==2){
                try {
                    left = GetValue(vals[0]);
                    right = GetValue(vals[1]);
                }

                catch (Exception e) {
                    return false;
                }

                if (left != null && right != null) {
                    if (left.arabian == right.arabian) {
                        arabian=left.arabian;
                        switch (operation) {
                            case ("-"):
                                answer = left.value - right.value;
                                error = false;
                                break;
                            case ("+"):
                                answer = left.value + right.value;
                                error = false;
                                break;
                            case ("*"):
                                answer = left.value * right.value;
                                error = false;
                                break;
                            case ("/"):
                                answer = left.value / right.value;
                                error = false;
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
        if(!error){
            System.out.println("Result is: "+ this.GetAnswer(answer,arabian));
        }
        return !error;
    }
}
