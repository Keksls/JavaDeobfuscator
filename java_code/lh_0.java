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
 * Renamed from lh
 */
public final class lh_0
extends GeneratedMessageV3
implements lk {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    int f;
    public static final int b = 2;
    boolean g;
    private byte h = (byte)-1;
    private static final lh_0 i = new lh_0();
    @Deprecated
    public static final Parser<lh_0> c = new li();

    lh_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lh_0() {
        this.f = 0;
        this.g = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lh_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt32();
                        continue block11;
                    }
                    case 16: 
                }
                this.e |= 2;
                this.g = codedInputStream.readBool();
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
        return kM.o;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.p.ensureFieldAccessorsInitialized(lh_0.class, lj_0.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public int c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public boolean e() {
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
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt32(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeBool(2, this.g);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lh_0)) {
            return super.equals(object);
        }
        lh_0 lh_02 = (lh_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == lh_02.b();
        if (this.b()) {
            bl = bl && this.c() == lh_02.c();
        }
        boolean bl3 = bl = bl && this.d() == lh_02.d();
        if (this.d()) {
            bl = bl && this.e() == lh_02.e();
        }
        bl = bl && this.unknownFields.equals((Object)lh_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lh_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.e());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lh_0 a(ByteBuffer byteBuffer) {
        return (lh_0)c.parseFrom(byteBuffer);
    }

    public static lh_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lh_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lh_0 a(ByteString byteString) {
        return (lh_0)c.parseFrom(byteString);
    }

    public static lh_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lh_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static lh_0 a(byte[] byArray) {
        return (lh_0)c.parseFrom(byArray);
    }

    public static lh_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lh_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static lh_0 a(InputStream inputStream) {
        return (lh_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static lh_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lh_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lh_0 b(InputStream inputStream) {
        return (lh_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static lh_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lh_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lh_0 a(CodedInputStream codedInputStream) {
        return (lh_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static lh_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lh_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lj_0 f() {
        return lh_0.g();
    }

    public static lj_0 g() {
        return i.h();
    }

    public static lj_0 a(lh_0 lh_02) {
        return i.h().a(lh_02);
    }

    public lj_0 h() {
        return this == i ? new lj_0() : new lj_0().a(this);
    }

    protected lj_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        lj_0 lj_02 = new lj_0(builderParent);
        return lj_02;
    }

    public static lh_0 i() {
        return i;
    }

    public static Parser<lh_0> j() {
        return c;
    }

    public Parser<lh_0> getParserForType() {
        return c;
    }

    public lh_0 k() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(lh_0 lh_02) {
        return lh_02.unknownFields;
    }
}

