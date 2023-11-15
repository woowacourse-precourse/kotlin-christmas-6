package christmas

fun main() {
    //TODO("프로그램 구현")
    println("test")
    val InputView1 = InputView()
    InputView1.readdata()
    val OutputView1 = OutputView()
    cpydata(InputView1,OutputView1)
    OutputView1.printdata()


}

fun cpydata( data1:InputView,  data2:OutputView)
{
    data2.YangsonisupCnt = data1.YangsonisupCnt
    data2.TapasCnt = data1.TapasCnt
    data2.CizersaladCnt = data1.CizersaladCnt
    data2.TbonesteakCnt = data1.TbonesteakCnt
    data2.BabequeripCnt = data1.BabequeripCnt
    data2.HasanmulpastaCnt = data1.HasanmulpastaCnt
    data2.ChrismaspastaCnt = data1.ChrismaspastaCnt
    data2.ChococakeCnt = data1.ChococakeCnt
    data2.IcecreamCnt = data1.IcecreamCnt
    data2.ZerocokeCnt = data1.ZerocokeCnt
    data2.RedwineCnt = data1.RedwineCnt
    data2.SyampainCnt = data1.SyampainCnt
    data2.commingday = data1.commingday

}
