/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from bn
 */
public final class bn_2
extends GeneratedMessageV3.Builder<bn_2>
implements ba_2 {
    private cd_2 a = null;
    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> b;
    private bo_1 c = null;
    private SingleFieldBuilderV3<bo_1, bq_1, br_1> d;
    private Object e = "";

    public static final Descriptors.Descriptor a() {
        return ak_2.Y;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.Z.ensureFieldAccessorsInitialized(bl_1.class, bn_2.class);
    }

    bn_2() {
        this.t();
    }

    bn_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.t();
    }

    private void t() {
        if (bl_1.p()) {
            // empty if block
        }
    }

    public bn_2 j() {
        super.clear();
        if (this.b == null) {
            this.a = null;
        } else {
            this.a = null;
            this.b = null;
        }
        if (this.d == null) {
            this.c = null;
        } else {
            this.c = null;
            this.d = null;
        }
        this.e = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.Y;
    }

    public bl_1 k() {
        return bl_1.m();
    }

    public bl_1 l() {
        bl_1 bl_12 = this.m();
        if (!bl_12.isInitialized()) {
            throw bn_2.newUninitializedMessageException((Message)bl_12);
        }
        return bl_12;
    }

    public bl_1 m() {
        bl_1 bl_12 = new bl_1(this);
        bl_12.e = this.b == null ? this.a : (cd_2)this.b.build();
        bl_12.f = this.d == null ? this.c : (bo_1)this.d.build();
        bl_12.g = this.e;
        this.onBuilt();
        return bl_12;
    }

    public bn_2 n() {
        return (bn_2)super.clone();
    }

    public bn_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bn_2)super.setField(fieldDescriptor, object);
    }

    public bn_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bn_2)super.clearField(fieldDescriptor);
    }

    public bn_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bn_2)super.clearOneof(oneofDescriptor);
    }

    public bn_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bn_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bn_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bn_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bn_2 a(Message message) {
        if (message instanceof bl_1) {
            return this.a((bl_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bn_2 a(bl_1 bl_12) {
        if (bl_12 == bl_1.m()) {
            return this;
        }
        if (bl_12.b()) {
            this.b(bl_12.c());
        }
        if (bl_12.e()) {
            this.b(bl_12.f());
        }
        if (!bl_12.h().isEmpty()) {
            this.e = bl_12.g;
            this.onChanged();
        }
        this.b(bl_1.b(bl_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bn_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bl_1 bl_12 = null;
        try {
            bl_12 = (bl_1)bl_1.j.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bl_12 = (bl_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bl_12 != null) {
                this.a(bl_12);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return this.b != null || this.a != null;
    }

    @Override
    public cd_2 c() {
        if (this.b == null) {
            return this.a == null ? cd_2.j() : this.a;
        }
        return (cd_2)this.b.getMessage();
    }

    public bn_2 a(cd_2 cd_22) {
        if (this.b == null) {
            if (cd_22 == null) {
                throw new NullPointerException();
            }
            this.a = cd_22;
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)cd_22);
        }
        return this;
    }

    public bn_2 a(cf_2 cf_22) {
        if (this.b == null) {
            this.a = cf_22.i();
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)cf_22.i());
        }
        return this;
    }

    public bn_2 b(cd_2 cd_22) {
        if (this.b == null) {
            this.a = this.a != null ? cd_2.a(this.a).a(cd_22).j() : cd_22;
            this.onChanged();
        } else {
            this.b.mergeFrom((AbstractMessage)cd_22);
        }
        return this;
    }

    public bn_2 o() {
        if (this.b == null) {
            this.a = null;
            this.onChanged();
        } else {
            this.a = null;
            this.b = null;
        }
        return this;
    }

    public cf_2 p() {
        this.onChanged();
        return (cf_2)this.u().getBuilder();
    }

    @Override
    public cq_1 d() {
        if (this.b != null) {
            return (cq_1)this.b.getMessageOrBuilder();
        }
        return this.a == null ? cd_2.j() : this.a;
    }

    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> u() {
        if (this.b == null) {
            this.b = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.a = null;
        }
        return this.b;
    }

    @Override
    public boolean e() {
        return this.d != null || this.c != null;
    }

    @Override
    public bo_1 f() {
        if (this.d == null) {
            return this.c == null ? bo_1.g() : this.c;
        }
        return (bo_1)this.d.getMessage();
    }

    public bn_2 a(bo_1 bo_12) {
        if (this.d == null) {
            if (bo_12 == null) {
                throw new NullPointerException();
            }
            this.c = bo_12;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)bo_12);
        }
        return this;
    }

    public bn_2 a(bq_1 bq_12) {
        if (this.d == null) {
            this.c = bq_12.f();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)bq_12.f());
        }
        return this;
    }

    public bn_2 b(bo_1 bo_12) {
        if (this.d == null) {
            this.c = this.c != null ? bo_1.a(this.c).a(bo_12).g() : bo_12;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)bo_12);
        }
        return this;
    }

    public bn_2 q() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.c = null;
            this.d = null;
        }
        return this;
    }

    public bq_1 r() {
        this.onChanged();
        return (bq_1)this.v().getBuilder();
    }

    @Override
    public br_1 g() {
        if (this.d != null) {
            return (br_1)this.d.getMessageOrBuilder();
        }
        return this.c == null ? bo_1.g() : this.c;
    }

    private SingleFieldBuilderV3<bo_1, bq_1, br_1> v() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.f(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    @Override
    public String h() {
        Object object = this.e;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.e = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString i() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public bn_2 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.e = string;
        this.onChanged();
        return this;
    }

    public bn_2 s() {
        this.e = bl_1.m().h();
        this.onChanged();
        return this;
    }

    public bn_2 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        bl_1.b(byteString);
        this.e = byteString;
        this.onChanged();
        return this;
    }

    public final bn_2 a(UnknownFieldSet unknownFieldSet) {
        return (bn_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bn_2 b(UnknownFieldSet unknownFieldSet) {
        return (bn_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

