/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from eVT
 */
public class evt_2
implements evn_2 {
    public static final abr_1<evn_2> a = new evu_2();
    private final TIntArrayList b;

    public evt_2(TIntArrayList tIntArrayList) {
        this.b = tIntArrayList;
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Ne devrait pas \u00eatre utilis\u00e9");
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Ne devrait pas \u00eatre utilis\u00e9");
    }

    @Override
    public evo_2 b() {
        return evo_2.f;
    }

    public TIntArrayList c() {
        return this.b;
    }

    public String toString() {
        return "InventoryGameAddItemAction{m_itemsToAdd=" + this.b + "}";
    }
}

