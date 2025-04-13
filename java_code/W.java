/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class W
extends GeneratedMessageV3
implements al_1 {
    private static final long c = 0L;
    public static final int a = 1;
    cd_2 d;
    public static final int b = 2;
    cd_2 e;
    private byte f = (byte)-1;
    private static final W g = new W();
    static final Parser<W> h = new X();

    W(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private W() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    W(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                cf_2 cf_22;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        cf_22 = null;
                        if (this.d != null) {
                            cf_22 = this.d.i();
                        }
                        this.d = (cd_2)codedInputStream.readMessage(cd_2.k(), extensionRegistryLite);
                        if (cf_22 == null) continue block11;
                        cf_22.a(this.d);
                        this.d = cf_22.j();
                        continue block11;
                    }
                    case 18: 
                }
                cf_22 = null;
                if (this.e != null) {
                    cf_22 = this.e.i();
                }
                this.e = (cd_2)codedInputStream.readMessage(cd_2.k(), extensionRegistryLite);
                if (cf_22 == null) continue;
                cf_22.a(this.e);
                this.e = cf_22.j();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return e_0.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.l.ensureFieldAccessorsInitialized(W.class, Y.class);
    }

    @Override
    public boolean b() {
        return this.d != null;
    }

    @Override
    public cd_2 c() {
        return this.d == null ? cd_2.j() : this.d;
    }

    @Override
    public cq_1 d() {
        return this.c();
    }

    @Override
    public boolean e() {
        return this.e != null;
    }

    @Override
    public cd_2 f() {
        return this.e == null ? cd_2.j() : this.e;
    }

    @Override
    public cq_1 g() {
        return this.f();
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.d != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c());
        }
        if (this.e != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.d != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.c());
        }
        if (this.e != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.f());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof W)) {
            return super.equals(object);
        }
        W w = (W)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == w.b();
        if (this.b()) {
            bl = bl && this.c().equals(w.c());
        }
        boolean bl3 = bl = bl && this.e() == w.e();
        if (this.e()) {
            bl = bl && this.f().equals(w.f());
        }
        bl = bl && this.unknownFields.equals((Object)w.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + W.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + this.f().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static W a(ByteBuffer byteBuffer) {
        return (W)h.parseFrom(byteBuffer);
    }

    public static W a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (W)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static W a(ByteString byteString) {
        return (W)h.parseFrom(byteString);
    }

    public static W a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (W)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static W a(byte[] byArray) {
        return (W)h.parseFrom(byArray);
    }

    public static W a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (W)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static W a(InputStream inputStream) {
        return (W)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static W a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (W)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static W b(InputStream inputStream) {
        return (W)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static W b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (W)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static W a(CodedInputStream codedInputStream) {
        return (W)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static W a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (W)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public Y h() {
        return W.i();
    }

    public static Y i() {
        return g.j();
    }

    public static Y a(W w) {
        return g.j().a(w);
    }

    public Y j() {
        return this == g ? new Y() : new Y().a(this);
    }

    protected Y a(GeneratedMessageV3.BuilderParent builderParent) {
        Y y = new Y(builderParent);
        return y;
    }

    public static W k() {
        return g;
    }

    public static Parser<W> l() {
        return h;
    }

    public Parser<W> getParserForType() {
        return h;
    }

    public W m() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(W w) {
        return w.unknownFields;
    }
}

