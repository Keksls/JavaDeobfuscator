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

public final class kE
extends GeneratedMessageV3
implements kl_0 {
    private static final long e = 0L;
    int f;
    public static final int a = 2;
    long g;
    public static final int b = 3;
    long h;
    public static final int c = 4;
    volatile Object i;
    private byte j = (byte)-1;
    private static final kE k = new kE();
    @Deprecated
    public static final Parser<kE> d = new kF();

    kE(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kE() {
        this.g = 0L;
        this.h = 0L;
        this.i = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 16: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 24: {
                        this.f |= 2;
                        this.h = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 34: 
                }
                ByteString byteString = codedInputStream.readBytes();
                this.f |= 4;
                this.i = byteString;
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
        return kC.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kC.b.ensureFieldAccessorsInitialized(kE.class, kg_0.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public long c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public long e() {
        return this.h;
    }

    @Override
    public boolean f() {
        return (this.f & 4) == 4;
    }

    @Override
    public String g() {
        Object object = this.i;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.i = string;
        }
        return string;
    }

    @Override
    public ByteString h() {
        Object object = this.i;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.i = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt64(2, this.g);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeInt64(3, this.h);
        }
        if ((this.f & 4) == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.g);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.h);
        }
        if ((this.f & 4) == 4) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kE)) {
            return super.equals(object);
        }
        kE kE2 = (kE)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == kE2.b();
        if (this.b()) {
            bl = bl && this.c() == kE2.c();
        }
        boolean bl3 = bl = bl && this.d() == kE2.d();
        if (this.d()) {
            bl = bl && this.e() == kE2.e();
        }
        boolean bl4 = bl = bl && this.f() == kE2.f();
        if (this.f()) {
            bl = bl && this.g().equals(kE2.g());
        }
        bl = bl && this.unknownFields.equals((Object)kE2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kE.a().hashCode();
        if (this.b()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.e());
        }
        if (this.f()) {
            n = 37 * n + 4;
            n = 53 * n + this.g().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kE a(ByteBuffer byteBuffer) {
        return (kE)d.parseFrom(byteBuffer);
    }

    public static kE a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kE)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kE a(ByteString byteString) {
        return (kE)d.parseFrom(byteString);
    }

    public static kE a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kE)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static kE a(byte[] byArray) {
        return (kE)d.parseFrom(byArray);
    }

    public static kE a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kE)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static kE a(InputStream inputStream) {
        return (kE)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static kE a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kE)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kE b(InputStream inputStream) {
        return (kE)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static kE b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kE)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kE a(CodedInputStream codedInputStream) {
        return (kE)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static kE a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kE)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kg_0 i() {
        return kE.j();
    }

    public static kg_0 j() {
        return k.k();
    }

    public static kg_0 a(kE kE2) {
        return k.k().a(kE2);
    }

    public kg_0 k() {
        return this == k ? new kg_0() : new kg_0().a(this);
    }

    protected kg_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        kg_0 kg_02 = new kg_0(builderParent);
        return kg_02;
    }

    public static kE l() {
        return k;
    }

    public static Parser<kE> m() {
        return d;
    }

    public Parser<kE> getParserForType() {
        return d;
    }

    public kE n() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kE kE2) {
        return kE2.unknownFields;
    }
}

