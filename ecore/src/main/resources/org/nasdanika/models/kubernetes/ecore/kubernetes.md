
```drawio-resource
kubernetes.drawio
```


Ecore model for [Kubernetes concepts](https://kubernetes.io/docs/concepts/). Part of the [Nasdanika](https://nasdanika.org) family of models.

## Intended Use

* **Creating models of Kubernetes solutions** (deployments, services, etc.) and then generating Kubernetes manifests from them.
* **Loading information about Kubernetes clusters** into a model for subsequent reporting, analysis, and generation of recommendations.

## Model Structure

The model is organized into the following packages:

* **kubernetes** (root) — Core concepts: `Cluster`, `Namespace`, `Node`, `Resource` (abstract base), `KeyValuePair`, `LabelSelector`, `Taint`
* **workloads** — Workload resources: `Pod`, `Deployment`, `ReplicaSet`, `StatefulSet`, `DaemonSet`, `Job`, `CronJob`, `Container`, `PodTemplateSpec`, `Volume`, `ContainerPort`, `EnvVar`, `VolumeMount`, `ResourceRequirements`
* **networking** — Networking resources: `Service`, `ServicePort`, `Ingress`, `IngressRule`, `HTTPIngressPath`
* **storage** — Storage resources: `PersistentVolume`, `PersistentVolumeClaim`, `StorageClass`
* **configuration** — Configuration resources: `ConfigMap`, `Secret`

## Resources

* [Kubernetes Documentation — Concepts](https://kubernetes.io/docs/concepts/)
* [Eclipse Modeling Framework (EMF)](https://eclipse.dev/modeling/emf/)
* [Nasdanika](https://nasdanika.org)
