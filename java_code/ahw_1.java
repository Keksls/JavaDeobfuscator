/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.protobuf.MessageLite
 */
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.MessageLite;

/*
 * Renamed from aHw
 */
public class ahw_1
implements ahr_1 {
    private final ImmutableMap<Class<? extends MessageLite>, ady_2<? extends MessageLite>> a;

    protected ahw_1(ady_2<? extends MessageLite> ... ady_2Array) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (ady_2<? extends MessageLite> ady_22 : ady_2Array) {
            builder.put(ady_22.a(), ady_22);
        }
        this.a = builder.build();
    }

    @Override
    public final boolean a(adt_1 adt_12) {
        if (!(adt_12 instanceof ahv_1)) {
            return true;
        }
        ahv_1 ahv_12 = (ahv_1)adt_12;
        MessageLite messageLite = ahv_12.b();
        ady_2 ady_22 = (ady_2)this.a.get(messageLite.getClass());
        return ady_22 == null || ady_22.a(messageLite);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

