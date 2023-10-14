```bash
helm upgrade --install gitlab gitlab/gitlab -n gitlab --create-namespace \
  --timeout 600s \
  --set global.hosts.domain=gitlab.homelab.local \
  --set global.edition=ce \
  --set certmanager-issuer.email=oussama.dahmaz@gmail.com \
  --set certmanager.rbac.create=false \
  --set nginx-ingress.rbac.createRole=false \
  --set prometheus.rbac.create=false \
  --set gitlab-runner.rbac.create=false \
  global.hosts.https
```

gitlab-webservice-default.gitlab.svc.cluster.local
concourse-web.concourse.svc.cluster.local:8080

```bash
helm upgrade gitlab gitlab/gitlab -n gitlab --values override.yaml
```