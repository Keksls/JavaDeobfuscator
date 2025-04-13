/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from bge
 */
class bge_2
extends emi {
    final /* synthetic */ bgd_2 a;

    bge_2(bgd_2 bgd_22) {
        this.a = bgd_22;
    }

    @Override
    public void a(emq emq2) {
        Object object;
        bgc_2.b.info((Object)(emq.class + " fetched"));
        if (emq2.a() != 0L) {
            object = new bvo_0(emq2.a());
            ((bvx_0)this.a.b.c.h()).a((bvo_0)object);
            try {
                ((ajb_1)object).i();
            }
            catch (IOException iOException) {
                bgc_2.b.warn((Object)("Error occurred on load of " + object.getClass()), (Throwable)iOException);
            }
        } else {
            bgc_2.b.warn((Object)(emq.class + " specify a null account"));
        }
        object = emq2.b();
        if (!Cz.f((String)object)) {
            fis_1.a().a("zaap.account.nicknameWithTag", object);
        } else {
            bgc_2.b.warn((Object)(emq.class + " specify a null/empty nickname"));
        }
        this.a.b.c.b(this.a.a);
    }

    @Override
    public void a(String string) {
        bgc_2.b.warn((Object)("Error during retrieval of " + emq.class + " connection(" + string + ")"));
        this.a.b.c.b(this.a.a);
    }
}

