/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;

/*
 * Renamed from cZE
 */
class cze_0
implements fzp_0 {
    final /* synthetic */ cZD a;

    cze_0(cZD cZD2) {
        this.a = cZD2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cnd_0 cnd_02 = new cnd_0(this.a.e.a_());
            TLongObjectIterator tLongObjectIterator = this.a.d.a().iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                exi_2 exi_22 = (exi_2)tLongObjectIterator.value();
                cnd_02.a(exi_22.a(), exi_22.e());
            }
            azu_0.j().K().c(cnd_02);
            this.a.d.c();
        }
    }
}

