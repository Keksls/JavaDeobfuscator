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

public final class kR
extends GeneratedMessageV3
implements kU {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    le_0 f;
    public static final int b = 2;
    int g;
    private byte h = (byte)-1;
    private static final kR i = new kR();
    @Deprecated
    public static final Parser<kR> c = new kS();

    kR(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kR() {
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        lg lg2 = null;
                        if ((this.e & 1) == 1) {
                            lg2 = this.f.G();
                        }
                        this.f = (le_0)codedInputStream.readMessage(le_0.l, extensionRegistryLite);
                        if (lg2 != null) {
                            lg2.a(this.f);
                            this.f = lg2.H();
                        }
                        this.e |= 1;
                        continue block11;
                    }
                    case 16: 
                }
                this.e |= 2;
                this.g = codedInputStream.readInt32();
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
        return kM.u;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.v.ensureFieldAccessorsInitialized(kR.class, kT.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public le_0 c() {
        return this.f == null ? le_0.H() : this.f;
    }

    @Override
    public lp d() {
        return this.f == null ? le_0.H() : this.f;
    }

    @Override
    public boolean e() {
        return (this.e & 2) == 2;
    }

    @Override
    public int f() {
        return this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (!this.e()) {
            this.h = 0;
            return false;
        }
        if (!this.c().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c());
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeInt32(2, this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.c());
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kR)) {
            return super.equals(object);
        }
        kR kR2 = (kR)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == kR2.b();
        if (this.b()) {
            bl = bl && this.c().equals(kR2.c());
        }
        boolean bl3 = bl = bl && this.e() == kR2.e();
        if (this.e()) {
            bl = bl && this.f() == kR2.f();
        }
        bl = bl && this.unknownFields.equals((Object)kR2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kR.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + this.f();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kR a(ByteBuffer byteBuffer) {
        return (kR)c.parseFrom(byteBuffer);
    }

    public static kR a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kR)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kR a(ByteString byteString) {
        return (kR)c.parseFrom(byteString);
    }

    public static kR a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kR)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static kR a(byte[] byArray) {
        return (kR)c.parseFrom(byArray);
    }

    public static kR a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kR)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static kR a(InputStream inputStream) {
        return (kR)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static kR a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kR)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kR b(InputStream inputStream) {
        return (kR)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static kR b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kR)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kR a(CodedInputStream codedInputStream) {
        return (kR)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static kR a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kR)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kT g() {
        return kR.h();
    }

    public static kT h() {
        return i.i();
    }

    public static kT a(kR kR2) {
        return i.i().a(kR2);
    }

    public kT i() {
        return this == i ? new kT() : new kT().a(this);
    }

    protected kT a(GeneratedMessageV3.BuilderParent builderParent) {
        kT kT2 = new kT(builderParent);
        return kT2;
    }

    public static kR j() {
        return i;
    }

    public static Parser<kR> k() {
        return c;
    }

    public Parser<kR> getParserForType() {
        return c;
    }

    public kR l() {
        return i;
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

    static /* synthetic */ UnknownFieldSet b(kR kR2) {
        return kR2.unknownFields;
    }
}

