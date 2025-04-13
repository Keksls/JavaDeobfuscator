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
 * Renamed from bl
 */
public final class bl_1
extends GeneratedMessageV3
implements ba_2 {
    private static final long d = 0L;
    public static final int a = 1;
    cd_2 e;
    public static final int b = 2;
    bo_1 f;
    public static final int c = 3;
    volatile Object g;
    private byte h = (byte)-1;
    private static final bl_1 i = new bl_1();
    static final Parser<bl_1> j = new bm_2();

    bl_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bl_1() {
        this.g = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bl_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                Object object;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        object = null;
                        if (this.e != null) {
                            object = this.e.i();
                        }
                        this.e = (cd_2)codedInputStream.readMessage(cd_2.k(), extensionRegistryLite);
                        if (object == null) continue block12;
                        ((cf_2)object).a(this.e);
                        this.e = ((cf_2)object).j();
                        continue block12;
                    }
                    case 18: {
                        object = null;
                        if (this.f != null) {
                            object = this.f.f();
                        }
                        this.f = (bo_1)codedInputStream.readMessage(bo_1.h(), extensionRegistryLite);
                        if (object == null) continue block12;
                        ((bq_1)object).a(this.f);
                        this.f = ((bq_1)object).g();
                        continue block12;
                    }
                    case 26: 
                }
                this.g = object = codedInputStream.readStringRequireUtf8();
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
        return ak_2.Y;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.Z.ensureFieldAccessorsInitialized(bl_1.class, bn_2.class);
    }

    @Override
    public boolean b() {
        return this.e != null;
    }

    @Override
    public cd_2 c() {
        return this.e == null ? cd_2.j() : this.e;
    }

    @Override
    public cq_1 d() {
        return this.c();
    }

    @Override
    public boolean e() {
        return this.f != null;
    }

    @Override
    public bo_1 f() {
        return this.f == null ? bo_1.g() : this.f;
    }

    @Override
    public br_1 g() {
        return this.f();
    }

    @Override
    public String h() {
        Object object = this.g;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.g = string;
        return string;
    }

    @Override
    public ByteString i() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.e != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c());
        }
        if (this.f != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f());
        }
        if (!this.i().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.e != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.c());
        }
        if (this.f != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.f());
        }
        if (!this.i().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bl_1)) {
            return super.equals(object);
        }
        bl_1 bl_12 = (bl_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == bl_12.b();
        if (this.b()) {
            bl = bl && this.c().equals(bl_12.c());
        }
        boolean bl3 = bl = bl && this.e() == bl_12.e();
        if (this.e()) {
            bl = bl && this.f().equals(bl_12.f());
        }
        bl = bl && this.h().equals(bl_12.h());
        bl = bl && this.unknownFields.equals((Object)bl_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bl_1.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + this.f().hashCode();
        }
        n = 37 * n + 3;
        n = 53 * n + this.h().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bl_1 a(ByteBuffer byteBuffer) {
        return (bl_1)j.parseFrom(byteBuffer);
    }

    public static bl_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)j.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bl_1 a(ByteString byteString) {
        return (bl_1)j.parseFrom(byteString);
    }

    public static bl_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)j.parseFrom(byteString, extensionRegistryLite);
    }

    public static bl_1 a(byte[] byArray) {
        return (bl_1)j.parseFrom(byArray);
    }

    public static bl_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)j.parseFrom(byArray, extensionRegistryLite);
    }

    public static bl_1 a(InputStream inputStream) {
        return (bl_1)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream);
    }

    public static bl_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bl_1 b(InputStream inputStream) {
        return (bl_1)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream);
    }

    public static bl_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bl_1 a(CodedInputStream codedInputStream) {
        return (bl_1)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream);
    }

    public static bl_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bn_2 j() {
        return bl_1.k();
    }

    public static bn_2 k() {
        return i.l();
    }

    public static bn_2 a(bl_1 bl_12) {
        return i.l().a(bl_12);
    }

    public bn_2 l() {
        return this == i ? new bn_2() : new bn_2().a(this);
    }

    protected bn_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        bn_2 bn_22 = new bn_2(builderParent);
        return bn_22;
    }

    public static bl_1 m() {
        return i;
    }

    public static Parser<bl_1> n() {
        return j;
    }

    public Parser<bl_1> getParserForType() {
        return j;
    }

    public bl_1 o() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bl_1 bl_12) {
        return bl_12.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        bl_1.checkByteStringIsUtf8((ByteString)byteString);
    }
}

