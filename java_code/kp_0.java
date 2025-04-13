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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from kp
 */
public final class kp_0
extends GeneratedMessageV3
implements ks_0 {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    volatile Object h;
    public static final int b = 2;
    long i;
    public static final int c = 3;
    le_0 j;
    public static final int d = 4;
    int k;
    private byte l = (byte)-1;
    private static final kp_0 m = new kp_0();
    @Deprecated
    public static final Parser<kp_0> e = new kq_0();

    kp_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kp_0() {
        this.h = "";
        this.i = 0L;
        this.k = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kp_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block13;
                        bl2 = true;
                        continue block13;
                    }
                    case 10: {
                        Object object = codedInputStream.readBytes();
                        this.g |= 1;
                        this.h = object;
                        continue block13;
                    }
                    case 16: {
                        this.g |= 2;
                        this.i = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 26: {
                        Object object = null;
                        if ((this.g & 4) == 4) {
                            object = this.j.G();
                        }
                        this.j = (le_0)codedInputStream.readMessage(le_0.l, extensionRegistryLite);
                        if (object != null) {
                            ((lg)object).a(this.j);
                            this.j = ((lg)object).H();
                        }
                        this.g |= 4;
                        continue block13;
                    }
                    case 32: 
                }
                this.g |= 8;
                this.k = codedInputStream.readInt32();
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
        return kg.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.h.ensureFieldAccessorsInitialized(kp_0.class, kr_0.class);
    }

    @Override
    public boolean b() {
        return (this.g & 1) == 1;
    }

    @Override
    public String c() {
        Object object = this.h;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.h = string;
        }
        return string;
    }

    @Override
    public ByteString d() {
        Object object = this.h;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.h = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean e() {
        return (this.g & 2) == 2;
    }

    @Override
    public long f() {
        return this.i;
    }

    @Override
    public boolean g() {
        return (this.g & 4) == 4;
    }

    @Override
    public le_0 h() {
        return this.j == null ? le_0.H() : this.j;
    }

    @Override
    public lp i() {
        return this.j == null ? le_0.H() : this.j;
    }

    @Override
    public boolean j() {
        return (this.g & 8) == 8;
    }

    @Override
    public int k() {
        return this.k;
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.l = 0;
            return false;
        }
        if (!this.e()) {
            this.l = 0;
            return false;
        }
        if (!this.g()) {
            this.l = 0;
            return false;
        }
        if (!this.j()) {
            this.l = 0;
            return false;
        }
        if (!this.h().isInitialized()) {
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.g & 1) == 1) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.h);
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeInt64(2, this.i);
        }
        if ((this.g & 4) == 4) {
            codedOutputStream.writeMessage(3, (MessageLite)this.h());
        }
        if ((this.g & 8) == 8) {
            codedOutputStream.writeInt32(4, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.g & 1) == 1) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.h);
        }
        if ((this.g & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.i);
        }
        if ((this.g & 4) == 4) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.h());
        }
        if ((this.g & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.k);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kp_0)) {
            return super.equals(object);
        }
        kp_0 kp_02 = (kp_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == kp_02.b();
        if (this.b()) {
            bl = bl && this.c().equals(kp_02.c());
        }
        boolean bl3 = bl = bl && this.e() == kp_02.e();
        if (this.e()) {
            bl = bl && this.f() == kp_02.f();
        }
        boolean bl4 = bl = bl && this.g() == kp_02.g();
        if (this.g()) {
            bl = bl && this.h().equals(kp_02.h());
        }
        boolean bl5 = bl = bl && this.j() == kp_02.j();
        if (this.j()) {
            bl = bl && this.k() == kp_02.k();
        }
        bl = bl && this.unknownFields.equals((Object)kp_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kp_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.f());
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + this.h().hashCode();
        }
        if (this.j()) {
            n = 37 * n + 4;
            n = 53 * n + this.k();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kp_0 a(ByteBuffer byteBuffer) {
        return (kp_0)e.parseFrom(byteBuffer);
    }

    public static kp_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kp_0)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kp_0 a(ByteString byteString) {
        return (kp_0)e.parseFrom(byteString);
    }

    public static kp_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kp_0)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static kp_0 a(byte[] byArray) {
        return (kp_0)e.parseFrom(byArray);
    }

    public static kp_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kp_0)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static kp_0 a(InputStream inputStream) {
        return (kp_0)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static kp_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kp_0)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kp_0 b(InputStream inputStream) {
        return (kp_0)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static kp_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kp_0)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kp_0 a(CodedInputStream codedInputStream) {
        return (kp_0)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static kp_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kp_0)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kr_0 l() {
        return kp_0.m();
    }

    public static kr_0 m() {
        return m.n();
    }

    public static kr_0 a(kp_0 kp_02) {
        return m.n().a(kp_02);
    }

    public kr_0 n() {
        return this == m ? new kr_0() : new kr_0().a(this);
    }

    protected kr_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        kr_0 kr_02 = new kr_0(builderParent);
        return kr_02;
    }

    public static kp_0 o() {
        return m;
    }

    public static Parser<kp_0> p() {
        return e;
    }

    public Parser<kp_0> getParserForType() {
        return e;
    }

    public kp_0 q() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kp_0 kp_02) {
        return kp_02.unknownFields;
    }
}

