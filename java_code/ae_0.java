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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from AE
 */
public final class ae_0
extends GeneratedMessageV3
implements ah_0 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    int f;
    public static final int b = 2;
    List<Integer> g;
    private byte h = (byte)-1;
    private static final ae_0 i = new ae_0();
    @Deprecated
    public static final Parser<ae_0> c = new af_0();

    ae_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ae_0() {
        this.f = 1;
        this.g = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ae_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2;
                int n3 = codedInputStream.readTag();
                switch (n3) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n3)) continue block12;
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        n2 = codedInputStream.readEnum();
                        ay_0 ay_02 = ay_0.a(n2);
                        if (ay_02 == null) {
                            builder.mergeVarintField(1, n2);
                            continue block12;
                        }
                        this.e |= 1;
                        this.f = n2;
                        continue block12;
                    }
                    case 16: {
                        if ((n & 2) != 2) {
                            this.g = new ArrayList<Integer>();
                            n |= 2;
                        }
                        this.g.add(codedInputStream.readInt32());
                        continue block12;
                    }
                    case 18: 
                }
                n2 = codedInputStream.readRawVarint32();
                int n4 = codedInputStream.pushLimit(n2);
                if ((n & 2) != 2 && codedInputStream.getBytesUntilLimit() > 0) {
                    this.g = new ArrayList<Integer>();
                    n |= 2;
                }
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    this.g.add(codedInputStream.readInt32());
                }
                codedInputStream.popLimit(n4);
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) == 2) {
                this.g = Collections.unmodifiableList(this.g);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return aw_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return aw_0.d.ensureFieldAccessorsInitialized(ae_0.class, ag_0.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public ay_0 c() {
        ay_0 ay_02 = ay_0.a(this.f);
        return ay_02 == null ? ay_0.a : ay_02;
    }

    @Override
    public List<Integer> d() {
        return this.g;
    }

    @Override
    public int e() {
        return this.g.size();
    }

    @Override
    public int a(int n) {
        return this.g.get(n);
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
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeEnum(1, this.f);
        }
        for (int k = 0; k < this.g.size(); ++k) {
            codedOutputStream.writeInt32(2, this.g.get(k).intValue());
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
            n += CodedOutputStream.computeEnumSize((int)1, (int)this.f);
        }
        int n2 = 0;
        for (int k = 0; k < this.g.size(); ++k) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.g.get(k));
        }
        n += n2;
        n += 1 * this.d().size();
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ae_0)) {
            return super.equals(object);
        }
        ae_0 ae_02 = (ae_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ae_02.b();
        if (this.b()) {
            bl = bl && this.f == ae_02.f;
        }
        bl = bl && this.d().equals(ae_02.d());
        bl = bl && this.unknownFields.equals((Object)ae_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ae_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.f;
        }
        if (this.e() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ae_0 a(ByteBuffer byteBuffer) {
        return (ae_0)c.parseFrom(byteBuffer);
    }

    public static ae_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ae_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ae_0 a(ByteString byteString) {
        return (ae_0)c.parseFrom(byteString);
    }

    public static ae_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ae_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ae_0 a(byte[] byArray) {
        return (ae_0)c.parseFrom(byArray);
    }

    public static ae_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ae_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ae_0 a(InputStream inputStream) {
        return (ae_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ae_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ae_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ae_0 b(InputStream inputStream) {
        return (ae_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ae_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ae_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ae_0 a(CodedInputStream codedInputStream) {
        return (ae_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ae_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ae_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ag_0 f() {
        return ae_0.g();
    }

    public static ag_0 g() {
        return i.h();
    }

    public static ag_0 a(ae_0 ae_02) {
        return i.h().a(ae_02);
    }

    public ag_0 h() {
        return this == i ? new ag_0() : new ag_0().a(this);
    }

    protected ag_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ag_0 ag_02 = new ag_0(builderParent);
        return ag_02;
    }

    public static ae_0 i() {
        return i;
    }

    public static Parser<ae_0> j() {
        return c;
    }

    public Parser<ae_0> getParserForType() {
        return c;
    }

    public ae_0 k() {
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

    static /* synthetic */ UnknownFieldSet b(ae_0 ae_02) {
        return ae_02.unknownFields;
    }
}

