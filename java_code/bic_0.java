/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bIC
 */
public final class bic_0
extends big_1 {
    private static final Logger a = Logger.getLogger(bic_0.class);
    private static final fzu_0 g = new fzu_0();
    String h = "";
    byte[] i;

    bic_0(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a("question.whatIsYourMessage", new Object[0]), 65542L);
        fzn_02.a(g);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new bID(this, exk_22));
        return true;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.put(this.i);
        return true;
    }

    @Override
    public int b() {
        return super.b() + this.i.length;
    }

    @Override
    public void c() {
        this.h = "";
    }

    public String toString() {
        return "InstanceSpeakerItemAction{m_message='" + this.h + "'}";
    }

    @Override
    public eyx_1 f() {
        return eyx_1.F;
    }

    static {
        g.a(100);
        g.a(new fjf_2(370, 35));
        g.b(200);
        g.a(true);
    }
}

