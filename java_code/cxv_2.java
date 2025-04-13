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
 * Renamed from cxV
 */
public class cxv_2
extends ps_0 {
    private static final Logger a = LoggerFactory.getLogger(cxv_2.class);
    private zk_2 b = zk_2.l();

    @Override
    public boolean a(byte[] byArray) {
        try {
            this.b = zk_2.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error("Problem parsing ProtoResourcePartition", (Throwable)invalidProtocolBufferException);
        }
        return true;
    }

    public zk_2 b() {
        return this.b;
    }

    @Override
    public int a() {
        return 12493;
    }
}

