/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aZU
 */
public class azu_0
extends cex_0 {
    private static final Logger c = Logger.getLogger(azu_0.class);
    private static final azu_0 d = new azu_0();
    private final azj_0 e = new azj_0();
    private bai_0 f;
    private bmr_1 g;
    private azp_0 h;
    private final bcq_0 i = new bcq_0();
    private fzm_0 j;

    public static azu_0 j() {
        return d;
    }

    public static byte[] b(long l) {
        byte[] byArray = Cz.a(azu_0.j().A());
        byte by = (byte)byArray.length;
        byte[] byArray2 = Cz.a(azu_0.j().B());
        byte by2 = (byte)byArray2.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + by + 1 + by2);
        byteBuffer.putLong(l);
        byteBuffer.put(by);
        byteBuffer.put(byArray);
        byteBuffer.put(by2);
        byteBuffer.put(byArray2);
        byte[] byArray3 = byteBuffer.array();
        return ccl_0.a.b(byArray3);
    }

    public static byte[] c(long l) {
        byte[] byArray = Cz.a(azu_0.j().C());
        byte by = (byte)byArray.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + by);
        byteBuffer.putLong(l);
        byteBuffer.put(by);
        byteBuffer.put(byArray);
        byte[] byArray2 = byteBuffer.array();
        return ccl_0.a.b(byArray2);
    }

    public bmr_1 k() {
        if (this.g != null && this.g.ak()) {
            blx_1 blx_12 = cZa.a().d();
            if (blx_12 != null && blx_12.bo()) {
                return (bmr_1)blx_12;
            }
            if (!fis_1.a().c("isInFightCreationOrPlacement")) {
                return (bmr_1)bzf_1.a(this.g);
            }
        }
        return this.g;
    }

    @Nullable
    public blx_1 l() {
        bmr_1 bmr_12 = this.k();
        if (bmr_12 == null) {
            return null;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 != null) {
            return bvx_22.N();
        }
        return bmr_12;
    }

    @Nullable
    public bOw m() {
        blx_1 blx_12 = this.l();
        if (blx_12 == null) {
            return null;
        }
        return blx_12.cg();
    }

    public void a(bmr_1 bmr_12) {
        if (this.g != null) {
            this.g.dN();
            this.g.bv().c(ccm_1.g());
            this.g.cD();
            this.g.dD();
        }
        this.g = bmr_12;
        cbf_2.a(this.g);
        Cr.a(this.g == null ? (byte)0 : this.g.gX());
        Cr.a(this.g == null ? "Unknown" : this.g.dp());
        Cr.c(this.g == null ? "Unknown" : this.g.bb().b());
        String string = this.g != null ? bae.h().a(39, (long)this.g.fE().n(), new Object[0]) : null;
        Cr.b(this.g == null ? "Unknown" : string);
        fis_1.a().a("localPlayer", bmr_12);
        fis_1.a().a("isInGame", bmr_12 != null);
        if (bmr_12 != null) {
            ((afv)bmr_12.bv()).a(ccm_1.g());
        }
        this.a((blx_1)bmr_12);
    }

    public void a(blx_1 blx_12) {
        fis_1.a().a("observedCharacter", blx_12);
    }

    public bai_0 n() {
        return this.f;
    }

    public void a(bai_0 bai_02) {
        this.f = bai_02;
        fis_1.a().a("localAccount", bai_02);
        cbf_2.b(bai_02);
    }

    @Override
    public void a(int n) {
        super.a(n);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.ao, n);
    }

    public void a(azp_0 azp_02) {
        this.h = azp_02;
    }

    public azp_0 o() {
        return this.h;
    }

    @Override
    public void p() {
        super.p();
        bwj_1.a().d();
        bNT.f().e();
        bxh_2.a().e();
        ble_1.E().C();
        apn_1.c();
        bow_2.a.c();
        cYA.a().e();
        bvs_2.a().d();
        brd_0.k.g();
        byp_1.a();
        bjb_1.a.a();
        this.f.a((BG)null);
        bmr_1 bmr_12 = this.g;
        if (bmr_12 != null) {
            aUxx.a().o();
            aUxx.a().p();
            bpc_2 bpc_22 = bmr_12.eE();
            if (bpc_22 != null) {
                bpc_22.a(true, false);
            }
            bmr_12.cy().k();
            bmr_12.y();
            ((ewx_2)bmr_12.a(ewl_1.a)).b();
            euw_2.a.b(bmr_12.U_());
            bzh_1.a();
        }
        cxo_0.n();
        afz_0.d().f();
        bhf_1.a().b();
        ccm_1.g().c();
        blc_2.a().b();
        aUL.a().b();
        long l = cgu_2.a().c();
        if (l > 0L) {
            adi_2.a().a(l);
        }
        if ((l = cgu_2.a().d()) > 0L) {
            adi_2.a().a(l);
        }
        blm_2.a().c();
        cdw_0.n().o();
        wc_0.p().b(cdq_0.a);
        wc_0.p().b(ael_0.a);
        wc_0.p().b(aol_0.d());
        bce_0.a().e();
        aPc.f().a();
        TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((faX)tIntObjectIterator.value()).b(buw_0.a);
        }
        buw_0.a.a();
        if (cZI.A()) {
            cZI.a().r();
        }
        bmf_2.a().d();
        euw_2.a.a();
        brd_0.k.b(true);
        bht.i.a();
        bvz_2.a.a(null);
        biz_2.a.a();
        bia_2.a.b();
        bua_2.a.b();
        bhy_2.a.b();
        bno_0.a();
        adw_1.a.a(bqy_0.c);
        this.a((bmr_1)null);
        this.a((blx_1)null);
        dcd_0.a().c();
        aND.f().e();
    }

    @Override
    public void a() {
        super.a();
        d.b(cyt_0.a());
        ddy_0.a().c();
        d.a(dai_0.a);
        d.a(bde.a);
    }

    @Override
    public void q() {
        super.q();
        bgg.a.c();
    }

    public void a(eru_2 eru_22) {
        this.a((byte)71);
        erw_2 erw_22 = eru_22.e().a();
        List<QP> list = IntStream.of(erw_22.b()).mapToObj(n -> new QP(erw_22.a(), n)).collect(Collectors.toList());
        this.e.a();
        this.e.a(list);
        this.e.a(this::N);
        this.e.b();
    }

    private void N() {
        this.a("Proxy connection error");
        this.O();
    }

    public void a(List<QP> list) {
        this.a((byte)71);
        if (!azn_0.a.b()) {
            c.warn((Object)("Connection try refused : client not in a valid state " + azn_0.a.a()));
            return;
        }
        azn_0.a.a(azo_0.b);
        this.e.a();
        this.e.a(list);
        this.e.a(this::O);
        this.e.b();
    }

    private void O() {
        c.error((Object)"Unable to connect to proxy");
        this.a((byte)53);
        cuo_0.e().b();
        fzw_0.a.a("loginLock", true);
        azn_0.a.a(azo_0.a);
        this.t();
    }

    public boolean r() {
        if (this.i.b()) {
            c.error((Object)"[CHAT] Inter chat already connected. Disconnecting now");
            this.i.a();
        }
        this.i.d();
        String string = azs_0.a().a("interChatUrl", "");
        String[] stringArray = string.split(":");
        if (stringArray.length != 2 || stringArray[0].isEmpty() || stringArray[1].isEmpty()) {
            c.error((Object)("[CHAT] Invalid url for inter chat, connection cancelled. url=" + string));
            return false;
        }
        String string2 = stringArray[0];
        int n = Integer.parseInt(stringArray[1]);
        bcr_0 bcr_02 = new bcr_0(this.i, string2);
        bcp_0 bcp_02 = new bcp_0((ChannelHandler)bcr_02, string2, n);
        return bcp_02.a(this.i);
    }

    @Override
    public void s() {
    }

    @Override
    public void b(int n) {
        c.info((Object)("queryResultCode : " + n));
    }

    @Override
    public void a(byte[] byArray) {
        this.a(cvv_0.a());
        String string = bae.h().a("link.support", new Object[0]);
        String string2 = bae.h().a("logon.invalidClientVersion", epj.c(epj.j), epj.c(byArray), string);
        fpm_0.b().a(string2, cfn_0.a(1), 1027L, 1, 2);
        cuo_0.e().b();
        fzw_0.a.a("loginLock", true);
        this.a("Invalid Client Version");
    }

    @Override
    protected void t() {
        this.a(cvv_0.a());
        cuo_0.e().b();
        fzw_0.a.a("loginLock", true);
        fpm_0.b().a(bae.h().a("logon.noProxyAvailable", new Object[0]), cfn_0.a(1), 1027L, 1, 1);
    }

    @Override
    protected void u() {
        if (this.h == null) {
            c.error((Object)"Aucune phase de login n'a \u00e9t\u00e9 \u00e9tablie !");
            return;
        }
        cuo_0.e().a(true).a(bae.h().a("logon.progress", new Object[0]), 0);
        ckl_1 ckl_12 = new ckl_1();
        this.K().c(ckl_12);
        ckk_1 ckk_12 = new ckk_1(this.h.a());
        this.K().c(ckk_12);
    }

    @Override
    protected void v() {
        if (this.j != null) {
            this.j.g();
        }
        this.j = fpm_0.b().a(bae.h().a("question.disconnect", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
        if (this.j == null) {
            return;
        }
        this.j.a(new azv_0(this));
    }

    public void a(blx_1 blx_12, abb_0 abb_02) {
        String string;
        blx_12.a(false, false);
        biI biI2 = blx_12.bv();
        biI2.a(abb_02);
        biI2.a(aej_2.b);
        String[] stringArray = new String[]{"AnimEmote-Coucou", "AnimEmote-Huss-Boucle", "AnimEmoteMarket-LeverMain"};
        String string2 = string = biI2.bs() ? "AnimArtefact-Nager-Debut" : stringArray[Hw.a(stringArray.length)];
        if (biI2.k(string)) {
            biI2.e(string);
        } else {
            abb_02.animationEnded(biI2);
        }
    }

    void P() {
        cuo_0.e().a(true).a(bae.h().a("disconnection.progress", new Object[0]), 0);
        bhh_1.a();
        this.a("LogOff");
        if (!this.c(cvv_0.a())) {
            this.a(cvv_0.a());
        }
    }

    @Override
    protected void w() {
        this.a("Going to World Selection");
    }

    @Override
    protected void x() {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.quit", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a(new azx_0(this));
    }

    public void a(@Nullable String string) {
        if (this.g != null) {
            euw_2.a.b(this.f.u(), bmr_12 -> {
                bmr_12.cg().p();
                return true;
            });
            long l = cgu_2.a().c();
            if (l > 0L) {
                adi_2.a().a(l);
            }
        }
        d.b(cfx_2.a);
        if (this.K() != null) {
            c.info((Object)("Sending DisconnectionMessage to Servers. Reason : {" + string + "}"));
            this.K().h();
        }
        if (this.h == azp_0.c || this.h == azp_0.d) {
            this.y();
        }
    }

    public void y() {
        ChannelFuture channelFuture = this.i.a();
        if (channelFuture == null) {
            return;
        }
        channelFuture.addListener(future -> aUS.a.b());
    }

    public void c(adt_1 adt_12) {
        throw new UnsupportedOperationException("Pas d'envoi de message \u00ef\u00bf\u00bd l'aide de cette entit\u00ef\u00bf\u00bd : voir : getNetworkEntity()");
    }

    public static void a(biE biE2) {
        if (azu_0.d.g == null) {
            return;
        }
        biI biI2 = azu_0.d.g.bv();
        if (biE2 == biI2) {
            return;
        }
        int n = biE2.G() - biI2.G();
        int n2 = biE2.H() - biI2.H();
        if (Math.abs(n) > 54 || Math.abs(n2) > 54) {
            c.warn((Object)("acteur (" + biE2.a() + ") se d\u00e9pla\u00e7ant trop loin (probl\u00e8me avec PartitionIntersectorCache?) camera=" + biI2.ap() + " acteurPos=" + biE2.ap()));
        }
    }

    public bcq_0 z() {
        return this.i;
    }
}

