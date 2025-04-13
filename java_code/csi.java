/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

public final class csi
extends ps_0 {
    private long a;
    private byte b;
    private long c;
    private exk_2 d;
    private final TLongObjectHashMap<eZR> e = new TLongObjectHashMap();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        this.d = new exk_2();
        vf_2 vf_22 = new vf_2();
        vf_22.b(byteBuffer);
        this.d.b(vf_22);
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            eZR eZR2 = eZR.a(by);
            eZR2.a(byteBuffer);
            if (eZR2.e() == 0) {
                ((ezq_0)eZR2).a(true);
            } else if (eZR2.e() == 2) {
                ((ezu_0)eZR2).a(true);
            }
            this.e.put(l, (Object)eZR2);
        }
        return false;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public byte d() {
        return this.b;
    }

    public exk_2 e() {
        return this.d;
    }

    public TLongObjectHashMap<eZR> f() {
        return this.e;
    }

    @Override
    public int a() {
        return 12181;
    }

    @Override
    public String toString() {
        return "AddItemToCompanionEquipmentResultMessage{m_companionId=" + this.a + ", m_equipmentPosition=" + this.b + ", m_originalItemUid=" + this.c + ", m_item=" + this.d + ", m_operations=" + this.e + "}";
    }
}

