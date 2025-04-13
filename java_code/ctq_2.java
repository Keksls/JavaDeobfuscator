/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Optional;

/*
 * Renamed from ctq
 */
public class ctq_2
extends csy_2 {
    private final EnumMap<end_1, aff_1> b = new EnumMap(end_1.class);

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            byte by = byteBuffer.get();
            Optional<end_1> optional = end_1.a(by);
            if (optional.isEmpty()) {
                A.error((Object)("Invalid id for FightMarkerType = " + by));
                return false;
            }
            aff_1 aff_12 = new aff_1();
            aff_12.b(byteBuffer.getInt());
            aff_12.c(byteBuffer.getInt());
            aff_12.a(byteBuffer.getShort());
            this.b.put(optional.get(), aff_12);
        }
        return true;
    }

    public EnumMap<end_1, aff_1> b() {
        return this.b;
    }

    @Override
    public int a() {
        return 12922;
    }
}

