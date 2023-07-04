import sys

input = sys.stdin.readline


def find_password(site_password_dict, site_list):
    answer = []
    for site in site_list:
        answer.append(site_password_dict[site])
        
    return "\n".join(answer)

if __name__ == "__main__":
    site_password_dict = {}
    site_list = []
    
    input_site, find_site = map(int, input().rstrip().split())
    
    for _ in range(input_site):
        site, password = input().rstrip().split()
        site_password_dict[site] = password
        
    
    for _ in range(find_site):
        site_list.append(input().rstrip())
        
    print(find_password(site_password_dict, site_list))