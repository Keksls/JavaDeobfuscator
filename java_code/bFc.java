/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;

class bFc {
    private final TShortObjectHashMap<Anm> a = new TShortObjectHashMap(biK.values().length);
    private final abu b;

    bFc(abu abu2) {
        this.b = abu2;
    }

    public void a(short s2) {
        biK biK2 = biK.a(s2);
        if (biK2 == null) {
            return;
        }
        Anm anm = (Anm)this.a.remove(s2);
        if (anm != null) {
            this.a(biK2, anm);
        }
    }

    private void a(biK biK2, Anm anm) {
        this.b.b(anm, biK2.m);
    }

    public void a(int n, short s2, boolean bl) {
        biK biK2 = biK.a(s2);
        if (biK2 == null) {
            return;
        }
        this.a(s2);
        if (!bl) {
            return;
        }
        try {
            String string = azs_0.a().a("ANMEquipmentPath");
            Anm anm = abu.c(String.format(string, n));
            this.b.a(anm, biK2.m);
            this.a.put(s2, (Object)anm);
        }
        catch (Exception exception) {
            bfb_0.aL().error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    public void a(ezr_0 ezr_02, short s2, byte by) {
        int n = by == 0 ? ezr_02.C() : ezr_02.D();
        this.a(n, s2, ezr_02.F().l());
    }

    public void a() {
        TShortObjectIterator tShortObjectIterator = this.a.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            biK biK2 = biK.a(tShortObjectIterator.key());
            this.a(biK2, (Anm)tShortObjectIterator.value());
        }
        this.a.clear();
    }
}

