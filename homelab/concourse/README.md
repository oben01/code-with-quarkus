```bash
helm install concourse concourse/concourse -n concourse --create-namespace --set concourse.web.externalUrl=http://concourse.homelab.local
```

```bash
helm upgrade concourse concourse/concourse -n concourse --values override.yaml
```
https://gitlab.homelab.local/concourse-tuto/quick-start/
https://gitlab.homelab.local/concourse-tuto/quick-start.git/