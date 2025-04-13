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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from gH
 */
public final class gh_1
extends GeneratedMessageV3.Builder<gh_1>
implements gm_1 {
    private int a;
    private List<gi_1> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<gi_1, gk_1, gl_1> c;

    public static final Descriptors.Descriptor a() {
        return gd_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gd_0.b.ensureFieldAccessorsInitialized(gf_1.class, gh_1.class);
    }

    gh_1() {
        this.m();
    }

    gh_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (gf_1.k()) {
            this.o();
        }
    }

    public gh_1 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gd_0.a;
    }

    public gf_1 f() {
        return gf_1.h();
    }

    public gf_1 g() {
        gf_1 gf_12 = this.h();
        if (!gf_12.isInitialized()) {
            throw gh_1.newUninitializedMessageException((Message)gf_12);
        }
        return gf_12;
    }

    public gf_1 h() {
        gf_1 gf_12 = new gf_1(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            gf_12.d = this.b;
        } else {
            gf_12.d = this.c.build();
        }
        this.onBuilt();
        return gf_12;
    }

    public gh_1 i() {
        return (gh_1)super.clone();
    }

    public gh_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gh_1)super.setField(fieldDescriptor, object);
    }

    public gh_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gh_1)super.clearField(fieldDescriptor);
    }

    public gh_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gh_1)super.clearOneof(oneofDescriptor);
    }

    public gh_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gh_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gh_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gh_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public gh_1 a(Message message) {
        if (message instanceof gf_1) {
            return this.a((gf_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gh_1 a(gf_1 gf_12) {
        if (gf_12 == gf_1.h()) {
            return this;
        }
        if (this.c == null) {
            if (!gf_12.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = gf_12.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(gf_12.d);
                }
                this.onChanged();
            }
        } else if (!gf_12.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = gf_12.d;
                this.a &= 0xFFFFFFFE;
                this.c = gf_1.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(gf_12.d);
            }
        }
        this.b(gf_1.b(gf_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public gh_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gf_1 gf_12 = null;
        try {
            gf_12 = (gf_1)gf_1.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gf_12 = (gf_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gf_12 != null) {
                this.a(gf_12);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<gi_1>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<gi_1> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public gi_1 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (gi_1)this.c.getMessage(n);
    }

    public gh_1 a(int n, gi_1 gi_12) {
        if (this.c == null) {
            if (gi_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, gi_12);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)gi_12);
        }
        return this;
    }

    public gh_1 a(int n, gk_1 gk_12) {
        if (this.c == null) {
            this.n();
            this.b.set(n, gk_12.j());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)gk_12.j());
        }
        return this;
    }

    public gh_1 a(gi_1 gi_12) {
        if (this.c == null) {
            if (gi_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(gi_12);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)gi_12);
        }
        return this;
    }

    public gh_1 b(int n, gi_1 gi_12) {
        if (this.c == null) {
            if (gi_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, gi_12);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)gi_12);
        }
        return this;
    }

    public gh_1 a(gk_1 gk_12) {
        if (this.c == null) {
            this.n();
            this.b.add(gk_12.j());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)gk_12.j());
        }
        return this;
    }

    public gh_1 b(int n, gk_1 gk_12) {
        if (this.c == null) {
            this.n();
            this.b.add(n, gk_12.j());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)gk_12.j());
        }
        return this;
    }

    public gh_1 a(Iterable<? extends gi_1> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public gh_1 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public gh_1 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public gk_1 d(int n) {
        return (gk_1)this.o().getBuilder(n);
    }

    @Override
    public gl_1 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (gl_1)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends gl_1> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public gk_1 k() {
        return (gk_1)this.o().addBuilder((AbstractMessage)gi_1.k());
    }

    public gk_1 e(int n) {
        return (gk_1)this.o().addBuilder(n, (AbstractMessage)gi_1.k());
    }

    public List<gk_1> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<gi_1, gk_1, gl_1> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final gh_1 a(UnknownFieldSet unknownFieldSet) {
        return (gh_1)super.setUnknownFields(unknownFieldSet);
    }

    public final gh_1 b(UnknownFieldSet unknownFieldSet) {
        return (gh_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

