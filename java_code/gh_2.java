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
 * Renamed from gh
 */
public final class gh_2
extends GeneratedMessageV3.Builder<gh_2>
implements gi_2 {
    private int a;
    private int b;
    private List<dr_1> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<dr_1, dt_2, du_2> d;

    public static final Descriptors.Descriptor a() {
        return gd_2.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gd_2.f.ensureFieldAccessorsInitialized(gf_2.class, gh_2.class);
    }

    gh_2() {
        this.p();
    }

    gh_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.p();
    }

    private void p() {
        if (gf_2.m()) {
            this.r();
        }
    }

    public gh_2 g() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gd_2.e;
    }

    public gf_2 h() {
        return gf_2.j();
    }

    public gf_2 i() {
        gf_2 gf_22 = this.j();
        if (!gf_22.isInitialized()) {
            throw gh_2.newUninitializedMessageException((Message)gf_22);
        }
        return gf_22;
    }

    public gf_2 j() {
        gf_2 gf_22 = new gf_2(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        gf_22.f = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            gf_22.g = this.c;
        } else {
            gf_22.g = this.d.build();
        }
        gf_22.e = n2;
        this.onBuilt();
        return gf_22;
    }

    public gh_2 k() {
        return (gh_2)super.clone();
    }

    public gh_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gh_2)super.setField(fieldDescriptor, object);
    }

    public gh_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gh_2)super.clearField(fieldDescriptor);
    }

    public gh_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gh_2)super.clearOneof(oneofDescriptor);
    }

    public gh_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gh_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gh_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gh_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public gh_2 a(Message message) {
        if (message instanceof gf_2) {
            return this.a((gf_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gh_2 a(gf_2 gf_22) {
        if (gf_22 == gf_2.j()) {
            return this;
        }
        if (gf_22.b()) {
            this.c(gf_22.c());
        }
        if (this.d == null) {
            if (!gf_22.g.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = gf_22.g;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.q();
                    this.c.addAll(gf_22.g);
                }
                this.onChanged();
            }
        } else if (!gf_22.g.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = gf_22.g;
                this.a &= 0xFFFFFFFD;
                this.d = gf_2.n() ? this.r() : null;
            } else {
                this.d.addAllMessages(gf_22.g);
            }
        }
        this.b(gf_2.b(gf_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public gh_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gf_2 gf_22 = null;
        try {
            gf_22 = (gf_2)gf_2.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gf_22 = (gf_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gf_22 != null) {
                this.a(gf_22);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public gh_2 c(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public gh_2 l() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    private void q() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<dr_1>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<dr_1> d() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int f() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public dr_1 a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (dr_1)this.d.getMessage(n);
    }

    public gh_2 a(int n, dr_1 dr_12) {
        if (this.d == null) {
            if (dr_12 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.set(n, dr_12);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)dr_12);
        }
        return this;
    }

    public gh_2 a(int n, dt_2 dt_22) {
        if (this.d == null) {
            this.q();
            this.c.set(n, dt_22.f());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)dt_22.f());
        }
        return this;
    }

    public gh_2 a(dr_1 dr_12) {
        if (this.d == null) {
            if (dr_12 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.add(dr_12);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)dr_12);
        }
        return this;
    }

    public gh_2 b(int n, dr_1 dr_12) {
        if (this.d == null) {
            if (dr_12 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.add(n, dr_12);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)dr_12);
        }
        return this;
    }

    public gh_2 a(dt_2 dt_22) {
        if (this.d == null) {
            this.q();
            this.c.add(dt_22.f());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)dt_22.f());
        }
        return this;
    }

    public gh_2 b(int n, dt_2 dt_22) {
        if (this.d == null) {
            this.q();
            this.c.add(n, dt_22.f());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)dt_22.f());
        }
        return this;
    }

    public gh_2 a(Iterable<? extends dr_1> iterable) {
        if (this.d == null) {
            this.q();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public gh_2 m() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public gh_2 d(int n) {
        if (this.d == null) {
            this.q();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public dt_2 e(int n) {
        return (dt_2)this.r().getBuilder(n);
    }

    @Override
    public du_2 b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (du_2)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends du_2> e() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public dt_2 n() {
        return (dt_2)this.r().addBuilder((AbstractMessage)dr_1.g());
    }

    public dt_2 f(int n) {
        return (dt_2)this.r().addBuilder(n, (AbstractMessage)dr_1.g());
    }

    public List<dt_2> o() {
        return this.r().getBuilderList();
    }

    private RepeatedFieldBuilderV3<dr_1, dt_2, du_2> r() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final gh_2 a(UnknownFieldSet unknownFieldSet) {
        return (gh_2)super.setUnknownFields(unknownFieldSet);
    }

    public final gh_2 b(UnknownFieldSet unknownFieldSet) {
        return (gh_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
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
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
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
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

