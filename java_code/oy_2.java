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
 * Renamed from oy
 */
public final class oy_2
extends GeneratedMessageV3
implements ob_1 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    List<Integer> f;
    public static final int b = 2;
    int g;
    private byte h = (byte)-1;
    private static final oy_2 i = new oy_2();
    @Deprecated
    public static final Parser<oy_2> c = new oz_2();

    oy_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private oy_2() {
        this.f = Collections.emptyList();
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    oy_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        if (!(bl & true)) {
                            this.f = new ArrayList<Integer>();
                            bl |= true;
                        }
                        this.f.add(codedInputStream.readInt32());
                        continue block12;
                    }
                    case 10: {
                        int n2 = codedInputStream.readRawVarint32();
                        int n3 = codedInputStream.pushLimit(n2);
                        if (!(bl & true) && codedInputStream.getBytesUntilLimit() > 0) {
                            this.f = new ArrayList<Integer>();
                            bl |= true;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.f.add(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n3);
                        continue block12;
                    }
                    case 16: 
                }
                this.e |= 1;
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
            if (bl & true) {
                this.f = Collections.unmodifiableList(this.f);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return oo_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo_1.b.ensureFieldAccessorsInitialized(oy_2.class, oa_1.class);
    }

    @Override
    public List<Integer> b() {
        return this.f;
    }

    @Override
    public int c() {
        return this.f.size();
    }

    @Override
    public int a(int n) {
        return this.f.get(n);
    }

    @Override
    public boolean d() {
        return (this.e & 1) == 1;
    }

    @Override
    public int e() {
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
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.f.size(); ++k) {
            codedOutputStream.writeInt32(1, this.f.get(k).intValue());
        }
        if ((this.e & 1) == 1) {
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
        int n2 = 0;
        for (int k = 0; k < this.f.size(); ++k) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.f.get(k));
        }
        n += n2;
        n += 1 * this.b().size();
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof oy_2)) {
            return super.equals(object);
        }
        oy_2 oy_22 = (oy_2)object;
        boolean bl = true;
        bl = bl && this.b().equals(oy_22.b());
        boolean bl2 = bl = bl && this.d() == oy_22.d();
        if (this.d()) {
            bl = bl && this.e() == oy_22.e();
        }
        bl = bl && this.unknownFields.equals((Object)oy_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + oy_2.a().hashCode();
        if (this.c() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static oy_2 a(ByteBuffer byteBuffer) {
        return (oy_2)c.parseFrom(byteBuffer);
    }

    public static oy_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (oy_2)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static oy_2 a(ByteString byteString) {
        return (oy_2)c.parseFrom(byteString);
    }

    public static oy_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (oy_2)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static oy_2 a(byte[] byArray) {
        return (oy_2)c.parseFrom(byArray);
    }

    public static oy_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (oy_2)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static oy_2 a(InputStream inputStream) {
        return (oy_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static oy_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oy_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oy_2 b(InputStream inputStream) {
        return (oy_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static oy_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oy_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oy_2 a(CodedInputStream codedInputStream) {
        return (oy_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static oy_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oy_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public oa_1 f() {
        return oy_2.g();
    }

    public static oa_1 g() {
        return i.h();
    }

    public static oa_1 a(oy_2 oy_22) {
        return i.h().a(oy_22);
    }

    public oa_1 h() {
        return this == i ? new oa_1() : new oa_1().a(this);
    }

    protected oa_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        oa_1 oa_12 = new oa_1(builderParent);
        return oa_12;
    }

    public static oy_2 i() {
        return i;
    }

    public static Parser<oy_2> j() {
        return c;
    }

    public Parser<oy_2> getParserForType() {
        return c;
    }

    public oy_2 k() {
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

    static /* synthetic */ UnknownFieldSet b(oy_2 oy_22) {
        return oy_22.unknownFields;
    }
}

