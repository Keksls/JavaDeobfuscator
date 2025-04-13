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
 * Renamed from Nf
 */
public final class nf_1
extends GeneratedMessageV3
implements ni_1 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    long f;
    public static final int b = 2;
    ByteString g;
    private byte h = (byte)-1;
    private static final nf_1 i = new nf_1();
    @Deprecated
    public static final Parser<nf_1> c = new ng_1();

    nf_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nf_1() {
        this.f = 0L;
        this.g = ByteString.EMPTY;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nf_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.f = codedInputStream.readSInt64();
                        continue block11;
                    }
                    case 18: 
                }
                this.e |= 2;
                this.g = codedInputStream.readBytes();
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
        return nd_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nd_1.b.ensureFieldAccessorsInitialized(nf_1.class, nh_1.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public ByteString e() {
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
            codedOutputStream.writeSInt64(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeBytes(2, this.g);
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
            n += CodedOutputStream.computeSInt64Size((int)1, (long)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nf_1)) {
            return super.equals(object);
        }
        nf_1 nf_12 = (nf_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == nf_12.b();
        if (this.b()) {
            bl = bl && this.c() == nf_12.c();
        }
        boolean bl3 = bl = bl && this.d() == nf_12.d();
        if (this.d()) {
            bl = bl && this.e().equals((Object)nf_12.e());
        }
        bl = bl && this.unknownFields.equals((Object)nf_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nf_1.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nf_1 a(ByteBuffer byteBuffer) {
        return (nf_1)c.parseFrom(byteBuffer);
    }

    public static nf_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nf_1)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nf_1 a(ByteString byteString) {
        return (nf_1)c.parseFrom(byteString);
    }

    public static nf_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nf_1)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static nf_1 a(byte[] byArray) {
        return (nf_1)c.parseFrom(byArray);
    }

    public static nf_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nf_1)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static nf_1 a(InputStream inputStream) {
        return (nf_1)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static nf_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nf_1)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nf_1 b(InputStream inputStream) {
        return (nf_1)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static nf_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nf_1)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nf_1 a(CodedInputStream codedInputStream) {
        return (nf_1)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static nf_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nf_1)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nh_1 f() {
        return nf_1.g();
    }

    public static nh_1 g() {
        return i.h();
    }

    public static nh_1 a(nf_1 nf_12) {
        return i.h().a(nf_12);
    }

    public nh_1 h() {
        return this == i ? new nh_1() : new nh_1().a(this);
    }

    protected nh_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        nh_1 nh_12 = new nh_1(builderParent);
        return nh_12;
    }

    public static nf_1 i() {
        return i;
    }

    public static Parser<nf_1> j() {
        return c;
    }

    public Parser<nf_1> getParserForType() {
        return c;
    }

    public nf_1 k() {
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

    static /* synthetic */ UnknownFieldSet b(nf_1 nf_12) {
        return nf_12.unknownFields;
    }
}

