package christmas

class OutputView: View()
{
    var totalprice = 0
    var ddayhalinprice1 = 0
    var weekhalinprice1 = 0
    var weekendhalinprice1 = 0
    var specialhalinprice1 = 0
    var junjunghalinprice1 = 0
    var totalhalinprice = 0
    var paymoney = 0
    var badge1 = badge.none
    var junjung = ejugjung.none
    fun printdata()
    {
        println("12월 "+commingday+"일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!")
        println("<주문 메뉴>")
        listjumun()
        println("할인 전 총주문 금액")
        caltotalprice()
        println(""+totalprice+"원")



        println("증정 메뉴")
        junjungmenucal()
        println("혜택 내역")
        print("크리스마스 디데이 할인:")
        halinpricecal()
        println(""+ddayhalinprice1+"원")
        weekdaycal()
        if(weekhalinprice1>0)
        {
            print("평일 할인:")
            println(""+weekhalinprice1+"원")
        }else if(weekendhalinprice1>0)
        {
            print("주말 할인:")
            println(""+weekendhalinprice1+"원")
        }
        specialcal()
        print("특별 할인:")
        println(""+specialhalinprice1+"원")
        print("증정 이벤트:")
        println(""+junjunghalinprice1+"원")
        println("총혜택 금액")
        totalhalinprice = ddayhalinprice1 + weekhalinprice1 + specialhalinprice1+junjunghalinprice1
        println("-"+totalhalinprice+"원")
        println("할인 후 예상 결졔 금액")
        paymoney =totalprice - totalhalinprice +junjunghalinprice1
        println(""+paymoney+"원")
        println("12월 이벤트 배지")
        badgecal()



    }
    fun specialcal()
    {
        var temp = commingday%7
        if((temp == 3)||(commingday==25))
        {
            specialhalinprice1 = 1000
        }

    }

    fun weekdaycal()
    {
        var temp = commingday % 7
        if((temp == 1)||(temp == 2))
        {
            weekendhalinprice1 = TbonesteakCnt + BabequeripCnt+HasanmulpastaCnt+ChrismaspastaCnt
            weekendhalinprice1 = weekendhalinprice1*2023
        }else{
            weekhalinprice1 = ChococakeCnt+IcecreamCnt
            weekhalinprice1 = weekhalinprice1*2023
        }

    }

    fun junjungmenucal()
    {
        if(totalprice>=120000)
        {
            junjung = ejugjung.shampaign
            println("샴페인 1개")
            junjunghalinprice1 = 25000
        }else{
            junjung = ejugjung.none
            println("없음")
        }
    }
    fun halinpricecal()
    {
        var temp = commingday - 1
        if(commingday <= 25) {
            if (totalprice >= 10000){
                ddayhalinprice1 = 1000 + temp * 100
            }
        }
    }
    fun badgecal()
    {
        if(totalhalinprice >= 20000)
        {
            badge1 = badge.santa
            println("산타")
        }else if(totalhalinprice >= 10000)
        {
            badge1 = badge.star
            println("스타")
        }else if(totalhalinprice >= 5000)
        {
            badge1 = badge.tree
            println("트리")
        }else{
            badge1 = badge.none
            println("없음")
        }
    }
    fun listjumun()
    {
        if(YangsonisupCnt>0)
        {
            print(YangsonisupStr+" ")
            println(""+YangsonisupCnt+"개")
        }
        if(TapasCnt>0)
        {
            print(TapasStr+" ")
            println(""+TapasCnt+"개")
        }
        if(CizersaladCnt>0)
        {
            print(CizersaladStr+" ")
            println(""+CizersaladCnt+"개")
        }
        if(TbonesteakCnt>0)
        {
            print(TbonesteakStr+" ")
            println(""+TbonesteakCnt+"개")
        }
        if(BabequeripCnt>0)
        {
            print(BabequeripStr+" ")
            println(""+BabequeripCnt+"개")
        }
        if(HasanmulpastaCnt>0)
        {
            print(HasanmulpastaStr+" ")
            println(""+HasanmulpastaCnt+"개")
        }
        if(ChrismaspastaCnt>0)
        {
            print(ChrismaspastaStr+" ")
            println(""+ChrismaspastaCnt+"개")
        }
        if(ChococakeCnt>0)
        {
            print(ChococakeStr+" ")
            println(""+ChococakeCnt+"개")
        }
        if(IcecreamCnt>0)
        {
            print(IcecreamStr+" ")
            println(""+IcecreamCnt+"개")
        }
        if(ZerocokeCnt>0)
        {
            print(ZerocokeStr+" ")
            println(""+ZerocokeCnt+"개")
        }
        if(RedwineCnt>0)
        {
            print(RedwineStr+" ")
            println(""+RedwineCnt+"개")
        }
        if(SyampainCnt>0)
        {
            print(SyampainStr+" ")
            println(""+SyampainCnt+"개")
        }
    }
    fun caltotalprice()
    {
        totalprice = YangsonisupCnt*YangsonisupMoney;
        totalprice = totalprice+TapasCnt*TapasMoney;
        totalprice = totalprice+CizersaladCnt*CizersaladMoney;
        totalprice = totalprice+CizersaladCnt*CizersaladMoney;
        totalprice = totalprice+TbonesteakCnt*TbonesteakMoney;
        totalprice = totalprice+BabequeripCnt*BabequeripMoney;
        totalprice = totalprice+HasanmulpastaCnt*HasanmulpastaMoney;
        totalprice = totalprice+ChrismaspastaCnt*ChrismaspastaMoney;
        totalprice = totalprice+ChococakeCnt*ChococakeMoney;
        totalprice = totalprice+IcecreamCnt*IcecreamMoney;
        totalprice = totalprice+ZerocokeCnt*ZerocokeMoney;
        totalprice = totalprice+RedwineCnt*RedwineMoney;
        totalprice = totalprice+SyampainCnt*SyampainMoney;
    }

}

enum class badge {
    none,
    star,
    tree,
    santa;
}
enum class ejugjung {
    none,
    shampaign;
}