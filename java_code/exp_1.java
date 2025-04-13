/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eXp
 */
public class exp_1<ReferenceItem extends ezr_0, ItemSet extends exo_2<ReferenceItem>> {
    protected static final Logger a = Logger.getLogger(exp_1.class);
    protected final TShortObjectHashMap<ItemSet> b = new TShortObjectHashMap();

    public void a(ItemSet ItemSet) {
        this.b.put(((exo_2)ItemSet).h(), ItemSet);
    }

    public ItemSet b(short s2) {
        return (ItemSet)((exo_2)this.b.get(s2));
    }

    public ItemSet a(ReferenceItem ReferenceItem) {
        return this.b(((ezr_0)ReferenceItem).x());
    }

    public short[] a(short s2, byte by) {
        return Cn.h;
    }
}

