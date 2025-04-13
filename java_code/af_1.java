/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 * Renamed from aF
 */
public final class af_1
extends GeneratedMessageV3.Builder<af_1>
implements ai_1 {
    private int a;
    private int b = 0;
    private av_2 c = null;
    private SingleFieldBuilderV3<av_2, ax_1, ay_2> d;

    public static final Descriptors.Descriptor a() {
        return ao_2.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ao_2.h.ensureFieldAccessorsInitialized(ad_1.class, af_1.class);
    }

    af_1() {
        this.q();
    }

    af_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.q();
    }

    private void q() {
        if (ad_1.n()) {
            // empty if block
        }
    }

    public af_1 h() {
        super.clear();
        this.a = 0;
        this.b = 0;
        if (this.d == null) {
            this.c = null;
        } else {
            this.c = null;
            this.d = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ao_2.g;
    }

    public ad_1 i() {
        return ad_1.k();
    }

    public ad_1 j() {
        ad_1 ad_12 = this.k();
        if (!ad_12.isInitialized()) {
            throw af_1.newUninitializedMessageException((Message)ad_12);
        }
        return ad_12;
    }

    public ad_1 k() {
        ad_1 ad_12 = new ad_1(this);
        ad_12.e = this.a;
        ad_12.f = this.b;
        ad_12.g = this.d == null ? this.c : (av_2)this.d.build();
        this.onBuilt();
        return ad_12;
    }

    public af_1 l() {
        return (af_1)super.clone();
    }

    public af_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (af_1)super.setField(fieldDescriptor, object);
    }

    public af_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (af_1)super.clearField(fieldDescriptor);
    }

    public af_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (af_1)super.clearOneof(oneofDescriptor);
    }

    public af_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (af_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public af_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (af_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public af_1 a(Message message) {
        if (message instanceof ad_1) {
            return this.a((ad_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public af_1 a(ad_1 ad_12) {
        if (ad_12 == ad_1.k()) {
            return this;
        }
        if (ad_12.b() != 0) {
            this.a(ad_12.b());
        }
        if (ad_12.f != 0) {
            this.b(ad_12.c());
        }
        if (ad_12.e()) {
            this.b(ad_12.f());
        }
        this.b(ad_1.b(ad_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public af_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ad_1 ad_12 = null;
        try {
            ad_12 = (ad_1)ad_1.j.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ad_12 = (ad_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ad_12 != null) {
                this.a(ad_12);
            }
        }
        return this;
    }

    @Override
    public int b() {
        return this.a;
    }

    public af_1 a(int n) {
        this.a = n;
        this.onChanged();
        return this;
    }

    public af_1 m() {
        this.a = 0;
        this.onChanged();
        return this;
    }

    @Override
    public int c() {
        return this.b;
    }

    public af_1 b(int n) {
        this.b = n;
        this.onChanged();
        return this;
    }

    @Override
    public ag_1 d() {
        ag_1 ag_12 = ag_1.a(this.b);
        return ag_12 == null ? ag_1.g : ag_12;
    }

    public af_1 a(ag_1 ag_12) {
        if (ag_12 == null) {
            throw new NullPointerException();
        }
        this.b = ag_12.getNumber();
        this.onChanged();
        return this;
    }

    public af_1 n() {
        this.b = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean e() {
        return this.d != null || this.c != null;
    }

    @Override
    public av_2 f() {
        if (this.d == null) {
            return this.c == null ? av_2.g() : this.c;
        }
        return (av_2)this.d.getMessage();
    }

    public af_1 a(av_2 av_22) {
        if (this.d == null) {
            if (av_22 == null) {
                throw new NullPointerException();
            }
            this.c = av_22;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)av_22);
        }
        return this;
    }

    public af_1 a(ax_1 ax_12) {
        if (this.d == null) {
            this.c = ax_12.f();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)ax_12.f());
        }
        return this;
    }

    public af_1 b(av_2 av_22) {
        if (this.d == null) {
            this.c = this.c != null ? av_2.a(this.c).a(av_22).g() : av_22;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)av_22);
        }
        return this;
    }

    public af_1 o() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.c = null;
            this.d = null;
        }
        return this;
    }

    public ax_1 p() {
        this.onChanged();
        return (ax_1)this.r().getBuilder();
    }

    @Override
    public ay_2 g() {
        if (this.d != null) {
            return (ay_2)this.d.getMessageOrBuilder();
        }
        return this.c == null ? av_2.g() : this.c;
    }

    private SingleFieldBuilderV3<av_2, ax_1, ay_2> r() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.f(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final af_1 a(UnknownFieldSet unknownFieldSet) {
        return (af_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final af_1 b(UnknownFieldSet unknownFieldSet) {
        return (af_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.h();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.l();
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
        return this.h();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.l();
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
        return this.l();
    }

    public /* synthetic */ Message buildPartial() {
        return this.k();
    }

    public /* synthetic */ Message build() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.k();
    }

    public /* synthetic */ MessageLite build() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Object clone() {
        return this.l();
    }
}

