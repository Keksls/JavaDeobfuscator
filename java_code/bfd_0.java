/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFd
 */
public class bfd_0
extends abn_1<ph_0> {
    private static final abm_1 a = new abm_1(new bFe());

    public bfb_0 a() {
        bfb_0 bfb_02;
        try {
            bfb_02 = (bfb_0)a.borrowObject();
            bfb_0.a(bfb_02, a);
        }
        catch (Exception exception) {
            bfb_0.aK().error((Object)"Erreur lors de l'extraction d'un CharacterStatueViewFactory du pool", (Throwable)exception);
            bfb_02 = new bfb_0();
        }
        return bfb_02;
    }

    @Override
    public /* synthetic */ abo_1 b() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.a();
    }
}

