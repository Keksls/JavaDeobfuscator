/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;
import java.util.HashMap;

public enum a {
    a(46524821076L, (MessageLite)AQ.h()),
    b(46536437334L, (MessageLite)Bc.i()),
    c(46536437504L, (MessageLite)bg_0.j()),
    d(46524822865L, (MessageLite)Bq.o()),
    e(46536440133L, (MessageLite)Bu.l()),
    f(47061870155L, (MessageLite)bk_0.q());

    private final long g;
    private final MessageLite h;

    private a(long l, MessageLite messageLite) {
        this.g = l;
        this.h = messageLite;
    }

    public static HashMap<Long, MessageLite> a() {
        a[] aArray;
        HashMap<Long, MessageLite> hashMap = new HashMap<Long, MessageLite>();
        for (a a2 : aArray = a.values()) {
            hashMap.put(a2.g, a2.h);
        }
        return hashMap;
    }
}

