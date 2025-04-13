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
 * Renamed from lq
 */
public final class lq_0
extends GeneratedMessageV3
implements lx {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    le_0 f;
    public static final int b = 2;
    int g;
    private byte h = (byte)-1;
    private static final lq_0 i = new lq_0();
    @Deprecated
    public static final Parser<lq_0> c = new lr_0();

    lq_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lq_0() {
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lq_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
        return kM.C;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.D.ensureFieldAccessorsInitialized(lq_0.class, ls.class);
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
        if (!(object instanceof lq_0)) {
            return super.equals(object);
        }
        lq_0 lq_02 = (lq_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == lq_02.b();
        if (this.b()) {
            bl = bl && this.c().equals(lq_02.c());
        }
        boolean bl3 = bl = bl && this.e() == lq_02.e();
        if (this.e()) {
            bl = bl && this.f() == lq_02.f();
        }
        bl = bl && this.unknownFields.equals((Object)lq_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lq_0.a().hashCode();
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

    public static lq_0 a(ByteBuffer byteBuffer) {
        return (lq_0)c.parseFrom(byteBuffer);
    }

    public static lq_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lq_0 a(ByteString byteString) {
        return (lq_0)c.parseFrom(byteString);
    }

    public static lq_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static lq_0 a(byte[] byArray) {
        return (lq_0)c.parseFrom(byArray);
    }

    public static lq_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static lq_0 a(InputStream inputStream) {
        return (lq_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static lq_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lq_0 b(InputStream inputStream) {
        return (lq_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static lq_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lq_0 a(CodedInputStream codedInputStream) {
        return (lq_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static lq_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ls g() {
        return lq_0.h();
    }

    public static ls h() {
        return i.i();
    }

    public static ls a(lq_0 lq_02) {
        return i.i().a(lq_02);
    }

    public ls i() {
        return this == i ? new ls() : new ls().a(this);
    }

    protected ls a(GeneratedMessageV3.BuilderParent builderParent) {
        ls ls2 = new ls(builderParent);
        return ls2;
    }

    public static lq_0 j() {
        return i;
    }

    public static Parser<lq_0> k() {
        return c;
    }

    public Parser<lq_0> getParserForType() {
        return c;
    }

    public lq_0 l() {
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

    static /* synthetic */ UnknownFieldSet b(lq_0 lq_02) {
        return lq_02.unknownFields;
    }
}

