package christmas

import camp.nextstep.edu.missionutils.Console

class InputView : View()
{

    fun readdata()
    {
        println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)")
        val day = Console.readLine()
        commingday = day.toInt()
        println("data:"+commingday)

        println("주문하실 메뉴를 메뉴와 개수를 알려주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1")
        val menu = Console.readLine()
        //var data : String
        val data = menu.split(",")
        for( i  in data) {
            println("menu" + i)
            println(i)
            menucnt(i)
        }

    }

    fun menucnt(input:String)
    {
        println(input)
        if(input.contains("-")) {
            val indata: List<String> = input.split("-")
            println("ok: " + indata[0] + indata[1])
            var data = includeclassdata(indata[0])
            println("메뉴 넘버 : "+data)
            entercnt(data,indata[1].toInt())
        }else
        {
            println("ng")
        }

    }
    fun includeclassdata(inputStr:String) :Int
    {
        if(inputStr.compareTo(YangsonisupStr)==0) {
            println(YangsonisupStr)
            return 1
        }
        else if(inputStr.compareTo(TapasStr)==0) {
            println(TapasStr)
            return 2
        }
        else if(inputStr.compareTo(CizersaladStr)==0) {
            println(CizersaladStr)
            return 3
        }
        else if(inputStr.compareTo(TbonesteakStr)==0) {
            println(TbonesteakStr)
            return 4
        }
        else if(inputStr.compareTo(BabequeripStr)==0) {
            println(BabequeripStr)
            return 5
        }else if(inputStr.compareTo(HasanmulpastaStr)==0) {
            println(HasanmulpastaStr)
            return 6
        }else if(inputStr.compareTo(ChrismaspastaStr)==0) {
            println(ChrismaspastaStr)
            return 7
        }else if(inputStr.compareTo(ChococakeStr)==0) {
            println(ChococakeStr)
            return 8
        }else if(inputStr.compareTo(IcecreamStr)==0) {
            println(IcecreamStr)
            return 9
        }else if(inputStr.compareTo(ZerocokeStr)==0) {
            println(ZerocokeStr)
            return 10
        }else if(inputStr.compareTo(RedwineStr)==0) {
            println(RedwineStr)
            return 11
        }else if(inputStr.compareTo(SyampainStr)==0) {
            println(SyampainStr)
            return 12
        }

        return 0
    }

    fun entercnt(data:Int, datacnt:Int)
    {
        if(data == 1)
        {
            YangsonisupCnt = datacnt
            println("cnt:"+YangsonisupCnt)
        }else if(data == 2)
        {
            TapasCnt = datacnt
            println("cnt:"+TapasCnt)
        }else if(data == 3)
        {
            CizersaladCnt = datacnt
            println("cnt:"+CizersaladCnt)
        }else if(data == 4)
        {
            TbonesteakCnt = datacnt
            println("cnt:"+TbonesteakCnt)
        }else if(data == 5)
        {
            BabequeripCnt = datacnt
            println("cnt:"+BabequeripCnt)
        }else if(data == 6)
        {
            HasanmulpastaCnt = datacnt
            println("cnt;"+HasanmulpastaCnt)
        }else if(data == 7)
        {
            ChrismaspastaCnt = datacnt
            println("cnt;"+ChrismaspastaCnt)
        }else if(data == 8)
        {
            ChococakeCnt = datacnt
            println("cnt:"+ChococakeCnt)
        }else if(data == 9)
        {
            IcecreamCnt = datacnt
            println("cnt:"+IcecreamCnt)
        }else if(data == 10)
        {
            ZerocokeCnt = datacnt
            println("cnt"+ZerocokeCnt)
        }else if(data == 11)
        {
            RedwineCnt = datacnt
            println("cnt"+RedwineCnt)
        }else if(data == 12)
        {
            SyampainCnt = datacnt
            println("cnt"+SyampainCnt)
        }

    }

}




