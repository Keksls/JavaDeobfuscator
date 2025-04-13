/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;
import java.util.HashMap;

/*
 * Renamed from MS
 */
public enum ms_2 {
    a(46532934236L, (MessageLite)mv_2.m());

    private final long b;
    private final MessageLite c;

    private ms_2(long l, MessageLite messageLite) {
        this.b = l;
        this.c = messageLite;
    }

    public static HashMap<Long, MessageLite> a() {
        ms_2[] ms_2Array;
        HashMap<Long, MessageLite> hashMap = new HashMap<Long, MessageLite>();
        for (ms_2 ms_22 : ms_2Array = ms_2.values()) {
            hashMap.put(ms_22.b, ms_22.c);
        }
        return hashMap;
    }
}

