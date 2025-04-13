/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import gnu.trove.iterator.TIntObjectIterator;

/*
 * Renamed from bdX
 */
class bdx_1
implements asb_2<ari_0> {
    final /* synthetic */ bdw_2 a;

    bdx_1(bdw_2 bdw_22) {
        this.a = bdw_22;
    }

    public void a(ari_0 ari_02) {
        try {
            ect_0 ect_02 = bdw_2.a(ari_02);
            ecn_0.a.a(ect_02);
            TIntObjectIterator<eco_0> tIntObjectIterator = ect_02.f();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                ((bhb_0)eyo_1.g()).c(((eco_0)tIntObjectIterator.value()).k().a());
            }
        }
        catch (Exception exception) {
            bdw_2.a.error((Object)("[GD] Exception au chargement du m\u00e9tier " + ari_02.c()), (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((ari_0)asu_22);
    }
}

