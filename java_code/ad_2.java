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

/*
 * Renamed from ad
 */
public final class ad_2
extends GeneratedMessageV3
implements ag_2 {
    private static final long c = 0L;
    public static final int a = 1;
    W d;
    public static final int b = 2;
    int e;
    private byte f = (byte)-1;
    private static final ad_2 g = new ad_2();
    static final Parser<ad_2> h = new ae_1();

    ad_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ad_2() {
        this.e = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ad_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n;
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        Y y = null;
                        if (this.d != null) {
                            y = this.d.j();
                        }
                        this.d = (W)codedInputStream.readMessage(W.l(), extensionRegistryLite);
                        if (y == null) continue block11;
                        y.a(this.d);
                        this.d = y.k();
                        continue block11;
                    }
                    case 16: 
                }
                this.e = n = codedInputStream.readEnum();
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
        return e_0.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.j.ensureFieldAccessorsInitialized(ad_2.class, af_2.class);
    }

    @Override
    public boolean b() {
        return this.d != null;
    }

    @Override
    public W c() {
        return this.d == null ? W.k() : this.d;
    }

    @Override
    public al_1 d() {
        return this.c();
    }

    @Override
    public int e() {
        return this.e;
    }

    @Override
    public T f() {
        T t = T.a(this.e);
        return t == null ? T.d : t;
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
        if (this.e != T.a.getNumber()) {
            codedOutputStream.writeEnum(2, this.e);
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
        if (this.e != T.a.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ad_2)) {
            return super.equals(object);
        }
        ad_2 ad_22 = (ad_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ad_22.b();
        if (this.b()) {
            bl = bl && this.c().equals(ad_22.c());
        }
        bl = bl && this.e == ad_22.e;
        bl = bl && this.unknownFields.equals((Object)ad_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ad_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        n = 37 * n + 2;
        n = 53 * n + this.e;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ad_2 a(ByteBuffer byteBuffer) {
        return (ad_2)h.parseFrom(byteBuffer);
    }

    public static ad_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_2)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ad_2 a(ByteString byteString) {
        return (ad_2)h.parseFrom(byteString);
    }

    public static ad_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_2)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static ad_2 a(byte[] byArray) {
        return (ad_2)h.parseFrom(byArray);
    }

    public static ad_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_2)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static ad_2 a(InputStream inputStream) {
        return (ad_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static ad_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ad_2 b(InputStream inputStream) {
        return (ad_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static ad_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ad_2 a(CodedInputStream codedInputStream) {
        return (ad_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static ad_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public af_2 g() {
        return ad_2.h();
    }

    public static af_2 h() {
        return g.i();
    }

    public static af_2 a(ad_2 ad_22) {
        return g.i().a(ad_22);
    }

    public af_2 i() {
        return this == g ? new af_2() : new af_2().a(this);
    }

    protected af_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        af_2 af_22 = new af_2(builderParent);
        return af_22;
    }

    public static ad_2 j() {
        return g;
    }

    public static Parser<ad_2> k() {
        return h;
    }

    public Parser<ad_2> getParserForType() {
        return h;
    }

    public ad_2 l() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ad_2 ad_22) {
        return ad_22.unknownFields;
    }
}

