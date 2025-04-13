/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.protobuf.InvalidProtocolBufferException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from cxY
 */
public class cxy_1
extends ps_0 {
    private static final Logger a = LoggerFactory.getLogger(cxy_1.class);
    private zg_2 b = zg_2.u();

    @Override
    public boolean a(byte[] byArray) {
        try {
            this.b = zg_2.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error("Problem parsing ProtoResourcePartition", (Throwable)invalidProtocolBufferException);
        }
        return true;
    }

    @Override
    public int a() {
        return 13793;
    }

    public zg_2 b() {
        return this.b;
    }
}

