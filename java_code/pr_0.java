/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;

/*
 * Renamed from PR
 */
public class pr_0
extends ps_0 {
    private ff a;

    @Override
    public boolean a(byte[] byArray) {
        try {
            this.a = ff.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            A.error((Object)"Error unserializing chat friend lists. Reseting lists.", (Throwable)invalidProtocolBufferException);
            this.a = ff.i().j();
        }
        return true;
    }

    @Override
    public int a() {
        return 731;
    }

    public ff b() {
        return this.a;
    }
}

